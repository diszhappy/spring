/**
 * 
 */
package in.diszhappy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.diszhappy.entiry.Employee;
import in.diszhappy.repo.EmployeeRepository;

/**
 * @author Saumm
 * Created on 16-Jul-2017 11:28:22 PM
 */
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	/**
	 * 
	 * This method is written by Saumm on 17-Jul-2017 1:30:54 AM
	 * Desc : This method will add anew employee
	 * @param employee
	 * @return
	 */
	public Employee add(Employee employee){
		return repository.save(employee);
	}
	/**
	 * 
	 * This method is written by Saumm on 17-Jul-2017 1:31:10 AM
	 * Desc : This method will update a new employee
	 * @param employee
	 * @return
	 */
	public Employee update(Employee employee){
		return repository.save(employee);
	}
	/**
	 * 
	 * This method is written by Saumm on 17-Jul-2017 1:31:29 AM
	 * Desc : This method will fetch all employee
	 * @return
	 */
	public List<Employee> findAll(){
		List<Employee> employees = new ArrayList<>();
		repository.findAll().forEach(employees::add);
		return employees;
	}
	
	/**
	 * 
	 * This method is written by Saumm on 17-Jul-2017 1:31:29 AM
	 * Desc : This method will fetch employee by name
	 * @return
	 */
	public Employee findByName(String name){
		return repository.findByName(name);
	}
	
	/**
	 * 
	 * This method is written by Saumm on 17-Jul-2017 1:31:41 AM
	 * Desc : This method will delete an employee based upon id
	 * @param id
	 */
	public void delete(Long id){
		repository.delete(id);
	}
}
