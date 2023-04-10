package rentACar.entities;

public class Employee extends Customer {

    private int salary;

    public Employee(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
