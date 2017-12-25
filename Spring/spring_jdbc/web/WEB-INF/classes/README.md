----------
	
**技术分析之Spring框架管理开源的连接池**
	
	1. 管理DBCP连接池
		* 先引入DBCP的2个jar包
			* com.springsource.org.apache.commons.dbcp-1.2.2.osgi.jar
			* com.springsource.org.apache.commons.pool-1.5.3.jar
		
		* 编写配置文件
			<bean id="dataSource" class="org.apache.commons.dbcp.BasicDataSource">
		    	<property name="driverClassName" value="com.mysql.jdbc.Driver"/>
		    	<property name="url" value="jdbc:mysql:///spring_day03"/>
		    	<property name="username" value="root"/>
		    	<property name="password" value="root"/>
		    </bean>
	
	2. 管理C3P0连接池
		* 先引入C3P0的jar包
			* com.springsource.com.mchange.v2.c3p0-0.9.1.2.jar
		
		* 编写配置文件
			<bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource">
		    	<property name="driverClass" value="com.mysql.jdbc.Driver"/>
		    	<property name="jdbcUrl" value="jdbc:mysql:///spring_day03"/>
		    	<property name="user" value="root"/>
		    	<property name="password" value="root"/>
		    </bean>
	
----------
	
**技术分析之Spring框架的JDBC模板的简单操作**
	
	1. 增删改查的操作
		@RunWith(SpringJUnit4ClassRunner.class)
		@ContextConfiguration("classpath:applicationContext.xml")
		public class SpringDemo3 {
			
			@Resource(name="jdbcTemplate")
			private JdbcTemplate jdbcTemplate;
			
			@Test
			// 插入操作
			public void demo1(){
				jdbcTemplate.update("insert into account values (null,?,?)", "冠希",10000d);
			}
			
			@Test
			// 修改操作
			public void demo2(){
				jdbcTemplate.update("update account set name=?,money =? where id = ?", "思雨",10000d,5);
			}
			
			@Test
			// 删除操作
			public void demo3(){
				jdbcTemplate.update("delete from account where id = ?", 5);
			}
			
			@Test
			// 查询一条记录
			public void demo4(){
				Account account = jdbcTemplate.queryForObject("select * from account where id = ?", new BeanMapper(), 1);
				System.out.println(account);
			}
			
			@Test
			// 查询所有记录
			public void demo5(){
				List<Account> list = jdbcTemplate.query("select * from t_account", new BeanMapper());
				for (Account account : list) {
					System.out.println(account);
				}
			}
		}
		
		class BeanMapper implements RowMapper<Account>{
			public Account mapRow(ResultSet rs, int arg1) throws SQLException {
				Account account = new Account();
				account.setId(rs.getInt("id"));
				account.setName(rs.getString("name"));
				account.setMoney(rs.getDouble("money"));
				return account;
			}
		}
	
----------