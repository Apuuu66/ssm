Spring整合Web项目
		* 引入spring-web-4.2.4.RELEASE.jar包
		* 配置监听器
			 <!-- 配置Spring的核心监听器: -->
			 <listener>
			 	<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
			 </listener>
			 <context-param>
			 	<param-name>contextConfigLocation</param-name>
			 	<param-value>classpath:applicationContext.xml</param-value>
			 </context-param>
	
	4. 修改servlet的代码
		* 从ServletContext中获得工厂
		* 具体代码如下
		 WebApplicationContext webac = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
			或者Struts
			ServletContext servletContext = ServletActionContext.getServletContext();
			// 需要使用WEB的工厂的方式
			WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);
			CustomerService cs = (CustomerService) context.getBean("customerService");
			cs.save();	
