package in.diszhappy.repo;

import org.springframework.data.repository.CrudRepository;

import in.diszhappy.entiry.Employee;

/**
 * 
 * @author Saumm
 * Created on 16-Jul-2017 11:29:11 PM
 */
public interface EmployeeRepository  extends CrudRepository<Employee, Long>{

}
