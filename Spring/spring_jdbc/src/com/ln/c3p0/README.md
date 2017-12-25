  <!--配置c3p0连接池-->
    <bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource">
        <!--基本配置-->
        <property name="jdbcUrl"
                  value="jdbc:mysql://localhost:3306/spring?useUnicode=true&amp;characterEncoding=utf-8&amp;useSSL=true"/>
        <property name="driverClass" value="com.mysql.jdbc.Driver"/>
        <property name="user" value="root"/>
        <property name="password" value="123456"/>
        <!--扩展配置-->
        <property name="initialPoolSize" value="10"/>
        <property name="acquireIncrement" value="3"/>
        <property name="maxIdleTime" value="30"/>
        <property name="minPoolSize" value="2"/>
        <property name="maxPoolSize" value="10"/>
    </bean>
    <bean id="jdbcTemplate" class="org.springframework.jdbc.core.JdbcTemplate">
        <property name="dataSource" ref="dataSource"/>
    </bean>
    
    <bean id="qr" class="org.apache.commons.dbutils.QueryRunner">
        <constructor-arg name="ds" ref="dataSource"/>
    </bean>