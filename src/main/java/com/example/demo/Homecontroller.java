package com.example.demo;

import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Homecontroller {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {

		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Krish");
		employee.setSalary(100000.0);

		DozerBeanMapper mapper = new DozerBeanMapper();
		EmployeeDTO employeeDTO = mapper.map(employee, EmployeeDTO.class);

		model.addAttribute("employeeDeatils",
				"Id: " + employeeDTO.getId() + ",Name:" + employeeDTO.getName() + ",Salary:" + employeeDTO.getSalary());
		return "greeting";
	}

}