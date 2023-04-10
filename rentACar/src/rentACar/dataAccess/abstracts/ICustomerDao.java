package rentACar.dataAccess.abstracts;

import rentACar.entities.Customer;

import java.util.List;

public interface ICustomerDao {
    void add(Customer customer);
    List<Customer> getAll();
    Customer getByName(String name);
    void delete(Customer customer);
}
