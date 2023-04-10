package rentACar.services.concretes;

import rentACar.dataAccess.abstracts.ICustomerDao;
import rentACar.entities.Customer;
import rentACar.services.abstracts.CustomerService;

import java.util.List;

public class CustomerManager implements CustomerService {

    private final ICustomerDao customerDao;

    public CustomerManager(ICustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void add(Customer customer) {
        if (customer.getAge() > 65) {
            System.out.println("65 yaşından büyüklere araba satılmıyor..");
            return;
        }
        customerDao.add(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customerDao.getAll();
    }

    @Override
    public Customer getByName(String name) {
        return customerDao.getByName(name);
    }

    @Override
    public void delete(Customer customer) {
        customerDao.delete(customer);
    }
}
