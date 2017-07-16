/**
 * 
 */
package in.diszhappy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	public Employee add(Employee employee){
		return repository.save(employee);
	}
	public Employee update(Employee employee){
		return repository.save(employee);
	}
	public List<Employee> findAll(){
		List<Employee> employees = new ArrayList<>();
		repository.findAll().forEach(employees::add);
		return employees;
	}
	public void delete(Long id){
		repository.delete(id);
	}
}
