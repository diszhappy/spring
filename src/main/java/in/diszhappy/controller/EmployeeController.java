/**
 * 
 */
package in.diszhappy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.diszhappy.entiry.Employee;
import in.diszhappy.service.EmployeeService;

/**
 * @author Saumm
 * Created on 16-Jul-2017 11:21:50 PM
 */
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	/**
	 * 
	 * This method is written by Saumm on 17-Jul-2017 1:32:25 AM
	 * Desc : This method will be used to register a new employee
	 * @param employee
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST,value="/add")
	public Employee add(@RequestBody Employee employee){
		return service.add(employee);
	}
	/**
	 * 
	 * This method is written by Saumm on 17-Jul-2017 1:32:50 AM
	 * Desc : This method will be used to update the details of an employee
	 * @param employee
	 * @return
	 */
	@RequestMapping(method=RequestMethod.PUT,value="/update")
	public Employee update(@RequestBody Employee employee){
		return service.update(employee);
	}
	/**
	 * 
	 * This method is written by Saumm on 17-Jul-2017 1:33:14 AM
	 * Desc : This method will fetch all employee details
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET,value="/findAll")
	public List<Employee> findAll(){
		return  service.findAll();
		
	}
	/**
	 * 
	 * This method is written by Saumm on 17-Jul-2017 1:33:41 AM
	 * Desc : This method will be used to delete an employee based on its id
	 * @param id
	 */
	@RequestMapping(method=RequestMethod.DELETE,value="/delete/{id}")
	public void delete(@PathVariable Long id){
		service.delete(id);
	}

}
