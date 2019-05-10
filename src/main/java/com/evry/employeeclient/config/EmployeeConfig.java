package com.evry.employeeclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

import com.evry.employee.resources.EmployeeResourceImplService;

@Configuration
public class EmployeeConfig{
	
	@Bean
	public EmployeeResourceImplService getEmployeeResourceImplService() {
		return new EmployeeResourceImplService();
	}
	
	@Bean
	public ModelAndView getModelAndView() {
		return new ModelAndView();
	}
	
	/*public void addViewControllers( ViewControllerRegistry registry ) {
        registry.addViewController( "/" ).setViewName( "forward:/WEB-INF/views/home.jsp" );
        registry.setOrder( Ordered.HIGHEST_PRECEDENCE );
        super.addViewControllers( registry );
    }*/

}
