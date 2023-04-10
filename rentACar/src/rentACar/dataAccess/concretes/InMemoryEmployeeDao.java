package rentACar.dataAccess.concretes;

import rentACar.dataAccess.abstracts.IEmployeeDao;
import rentACar.entities.Employee;

import java.util.ArrayList;
import java.util.List;

public class InMemoryEmployeeDao implements IEmployeeDao {
    List<Employee> employees = new ArrayList<>();

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void delete(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public Employee getBySalary(int salary) {
        return employees.stream().filter((employee -> employee.getSalary() == salary)).findFirst().orElseThrow();
    }
}
