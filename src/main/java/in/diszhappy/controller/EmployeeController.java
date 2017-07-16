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
	@RequestMapping(method=RequestMethod.POST,value="/add")
	public Employee add(@RequestBody Employee employee){
		return service.add(employee);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/update")
	public Employee update(@RequestBody Employee employee){
		return service.update(employee);
	}
	@RequestMapping(method=RequestMethod.GET,value="/findAll")
	public List<Employee> findAll(){
		return  service.findAll();
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/delete/{id}")
	public void delete(@PathVariable Long id){
		service.delete(id);
	}

}
