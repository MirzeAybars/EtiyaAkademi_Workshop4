package rentACar.dataAccess.abstracts;

import rentACar.entities.Employee;

import java.util.List;

public interface IEmployeeDao {
    void add(Employee employee);

    List<Employee> getAll();

    void delete(Employee employee);

    Employee getBySalary(int salary);
}
