package simple.employee.Employee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import simple.employee.Employee.Dao.EmployeeDao;
import simple.employee.Employee.Dto.Employee;

import java.util.*;

@RestController
@RequestMapping("employee")
public class EmpController {
	
	@Autowired
	EmployeeDao dao;
	
	@PostMapping("save")
	public Employee saveEmployee( @RequestBody Employee e) {
		
		return dao.saveEmployee(e);
	}
	
	@GetMapping("getEmployeeById")
	public Employee getEmployeeById(@RequestParam int id) {
		
		return  dao.getEmployeeById(id) ;
	
	}  
	
	@GetMapping("getAll")
	public List<Employee>  getAll(){
		
		List<Employee> rs = dao.getAll();
		
		
		return rs;
	}

}
