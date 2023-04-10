package rentACar.services.abstracts;

import rentACar.entities.Employee;

import java.util.List;

public interface EmployeeService {
    void add(Employee employee);

    List<Employee> getAll();

    void delete(Employee employee);

    Employee getBySalary(int salary);
}
