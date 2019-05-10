package com.evry.employeeclient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.evry.employee.resources.EmployeeEntity;
import com.evry.employee.resources.EmployeeResourceImplService;

@Controller
public class EmployeeController {

	@Autowired
	private ModelAndView modelAndView;

	@Autowired
	private EmployeeResourceImplService resourceImplService;

	@GetMapping("/")
	public String index() {
		return "home";
	}

	@PostMapping("/addEmployee")
	public ModelAndView addEmployee(EmployeeEntity employeeEntity) {

		EmployeeEntity addedEmployee = resourceImplService.getEmployeeResourceImplPort().addEmployee(employeeEntity);
		modelAndView.addObject(addedEmployee);
		modelAndView.setViewName("AddSuccess");

		return modelAndView;

	}

	@PostMapping("/updateEmployee")
	public ModelAndView updateEmployee(EmployeeEntity employeeEntity) {

		EmployeeEntity updatedEmployee = resourceImplService.getEmployeeResourceImplPort().updateEmployee(employeeEntity);
		if(updatedEmployee!=null) {
			modelAndView.addObject("updatedEmployee",updatedEmployee);
			modelAndView.setViewName("UpdateSuccess");
		}

		return modelAndView;
	}
	
	@GetMapping("/getEmployee")
	public ModelAndView getEmployee(int employeeId) {
		
		EmployeeEntity employee = resourceImplService.getEmployeeResourceImplPort().getEmployee(employeeId);
		System.out.println(employee);
		if(employee!=null) {
			modelAndView.addObject("employee",employee);
		modelAndView.setViewName("GetEmployee");
		}
		else
			return null;
		return modelAndView;
	}
	
	@GetMapping("/getAllEmployees")
	public ModelAndView getAllEmployees() {
		
		List<EmployeeEntity> allEmployees = resourceImplService.getEmployeeResourceImplPort().getAllEmployees();
		if(allEmployees!=null) {
			modelAndView.addObject("allEmployees",allEmployees);
			modelAndView.setViewName("GetAllEmployees");
		}
		else
			return null;
		return modelAndView;
	}
	
	@PostMapping("/deleteEmployee")
	public ModelAndView deleteEmployee(int employeeId) {

		resourceImplService.getEmployeeResourceImplPort().deleteEmployee(employeeId);
		
			modelAndView.setViewName("DeleteSuccess");
	
		return modelAndView;

	}
	
	@PostMapping("/login")
	public ModelAndView login(String employeeEmailId, String employeePassword) {
		
		EmployeeEntity employee = resourceImplService.getEmployeeResourceImplPort().login(employeeEmailId,employeePassword);
		
		if(employee!=null) {
			modelAndView.addObject(employee);
			modelAndView.setViewName("LoginSuccess");
			
		}
		else modelAndView.setViewName("LoginFailed");
		
		return modelAndView;
	}

}
