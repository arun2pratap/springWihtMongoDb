package com.example.endPoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.repo.Employee;
import com.example.repo.EmployeeRepository;

@RestController
@RequestMapping("/picnic")
public class PicnicController {
	private EmployeeRepository employee ;
	
	@Autowired
	PicnicController(EmployeeRepository employee){
		this.employee = employee;
	}
	
    @RequestMapping("/allEmp")
	public List<Employee> getEmployee()
	{
		return employee.findAll();
	}
    
    @RequestMapping("/firstName")
	public List<Employee> byFirstName(@RequestParam("firstName") String firstName)
	{
		return employee.findByFirstName(firstName);
	}
    
    @RequestMapping("/firstLast")
	public List<Employee> byFirstName(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName)
	{
		return employee.findByFirstNameOrLastName(firstName, lastName);
	}
    
    @RequestMapping("/save")
	public Employee saveEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName)
	{
		return employee.save(new Employee(firstName,lastName));
	}


    @RequestMapping("/")
    public String homePage(){
        return "Home page";
    }

    @RequestMapping("/name")
    public String homePage(@RequestParam("name") String name){
        return "Welcome " + name;
    }
}
