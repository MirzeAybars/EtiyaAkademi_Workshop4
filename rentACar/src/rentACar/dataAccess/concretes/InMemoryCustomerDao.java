package rentACar.dataAccess.concretes;

import rentACar.dataAccess.abstracts.ICustomerDao;
import rentACar.entities.Customer;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCustomerDao implements ICustomerDao {

    List<Customer> customers = new ArrayList<>();

    @Override
    public void add(Customer customer) {
        customers.add(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customers;
    }

    @Override
    public Customer getByName(String name) {
        return customers.stream().filter(customer -> customer.getFirstName() == name).findFirst().orElseThrow();
    }

    @Override
    public void delete(Customer customer) {
        customers.remove(customer);
    }
}
