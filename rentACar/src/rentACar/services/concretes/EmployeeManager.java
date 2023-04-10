package rentACar.services.concretes;

import rentACar.dataAccess.abstracts.IEmployeeDao;
import rentACar.entities.Employee;
import rentACar.services.abstracts.EmployeeService;

import java.util.List;

public class EmployeeManager implements EmployeeService {
    private final IEmployeeDao employeeDao;

    public EmployeeManager(IEmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public void add(Employee employee) {
        if (employee.getAge() > 45) {
            System.out.println("45 yaşından büyükler çalışamaz");
            return;
        }
        employeeDao.add(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }

    @Override
    public void delete(Employee employee) {
        employeeDao.delete(employee);
    }

    @Override
    public Employee getBySalary(int salary) {
        return employeeDao.getBySalary(salary);
    }
}
