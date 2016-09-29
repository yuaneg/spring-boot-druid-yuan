package com.yuan;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.alibaba.druid.support.http.StatViewServlet;

@SpringBootApplication
public class SpringBootDruidYuanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDruidYuanApplication.class, args);
	}
	
	@Bean
    public ServletRegistrationBean servletRegistrationBean() {
	   StatViewServlet statViewServlet =  new StatViewServlet();
	   ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(statViewServlet, "/druid/*");
	   Map<String,String> map = new HashMap<String,String>();
	   map.put("loginUsername", "yuaneg");
	   map.put("loginPassword", "123456");
	   servletRegistrationBean.setInitParameters(map);
       return servletRegistrationBean;
    }

}
