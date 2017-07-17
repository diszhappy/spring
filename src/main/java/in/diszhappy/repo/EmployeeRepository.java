package in.diszhappy.repo;

import org.springframework.data.repository.CrudRepository;

import in.diszhappy.entiry.Employee;

/**
 * 
 * @author Saumm
 * Created on 16-Jul-2017 11:29:11 PM
 */
public interface EmployeeRepository  extends CrudRepository<Employee, Long>{
	/**
	 * 
	 * This method is written by Saumm on 17-Jul-2017 8:15:34 AM
	 * Desc : This method will help to fetch records by name
	 * @param name
	 * @return
	 */
	Employee findByName(String name);

}
