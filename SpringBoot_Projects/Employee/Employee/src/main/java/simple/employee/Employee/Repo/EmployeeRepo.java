package simple.employee.Employee.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import simple.employee.Employee.Dto.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
