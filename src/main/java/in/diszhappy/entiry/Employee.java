/**
 * 
 */
package in.diszhappy.entiry;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author Saumm Created on 16-Jul-2017 11:22:15 PM
 */
@Entity(name="employee")
public class Employee implements Serializable {

	private static final long serialVersionUID = -3333986832642718268L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq")
	@SequenceGenerator(name = "employee_seq", sequenceName = "employee_seq")
	private Long id;
	private String name;
	private String dept;
	private String address;

	/**
	 * Added By Saumm on 16-Jul-2017 11:25:24 PM
	 * 
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Added By Saumm on 16-Jul-2017 11:25:24 PM
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Added By Saumm on 16-Jul-2017 11:25:24 PM
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Added By Saumm on 16-Jul-2017 11:25:24 PM
	 * 
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Added By Saumm on 16-Jul-2017 11:25:24 PM
	 * 
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}

	/**
	 * Added By Saumm on 16-Jul-2017 11:25:24 PM
	 * 
	 * @param dept
	 *            the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}

	/**
	 * Added By Saumm on 16-Jul-2017 11:25:24 PM
	 * 
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Added By Saumm on 16-Jul-2017 11:25:24 PM
	 * 
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
