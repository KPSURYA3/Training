package simple.employee.Employee.Dao;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import simple.employee.Employee.Dto.Employee;
import simple.employee.Employee.Repo.EmployeeRepo;

@Repository
public class EmployeeDao {

	@Autowired
	EmployeeRepo repo;

	public Employee saveEmployee(Employee e) {

		return repo.save(e);
		
	}
	

	public Employee getEmployeeById(int id) {
		Optional<Employee> o = repo.findById(id);
		if(o.isPresent()) {
			return o.get();
		}
		return null;
	}
	
	public List<Employee> getAll() {

		return repo.findAll();
	}

}
