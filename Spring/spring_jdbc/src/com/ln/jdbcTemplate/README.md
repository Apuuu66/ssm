编写测试代码（自己来new对象的方式）
		@Test
		public void run1(){
			// 创建连接池，先使用Spring框架内置的连接池
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName("com.mysql.jdbc.Driver");
			dataSource.setUrl("jdbc:mysql:///spring_day03");
			dataSource.setUsername("root");
			dataSource.setPassword("root");
			// 创建模板类
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			// 完成数据的添加
			jdbcTemplate.update("insert into t_account values (null,?,?)", "测试",10000);
		}
	
----------
	
**技术分析之使用Spring框架来管理模板类**
	
	1. 刚才编写的代码使用的是new的方式，应该把这些类交给Spring框架来管理。
	2. 修改的步骤如下
		* 步骤一：Spring管理内置的连接池
			<bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
		    	<property name="driverClassName" value="com.mysql.jdbc.Driver"/>
		    	<property name="url" value="jdbc:mysql:///spring_day03"/>
		    	<property name="username" value="root"/>
		    	<property name="password" value="root"/>
		    </bean>
		
		* 步骤二：Spring管理模板类
			<bean id="jdbcTemplate" class="org.springframework.jdbc.core.JdbcTemplate">
		    	<property name="dataSource" ref="dataSource"/>
		    </bean>
		
		* 步骤三：编写测试程序
			@RunWith(SpringJUnit4ClassRunner.class)
			@ContextConfiguration("classpath:applicationContext.xml")
			public class Demo2 {
				
				@Resource(name="jdbcTemplate")
				private JdbcTemplate jdbcTemplate;
				
				@Test
				public void run2(){
					jdbcTemplate.update("insert into t_account values (null,?,?)", "测试2",10000);
				}
			}
	
----------