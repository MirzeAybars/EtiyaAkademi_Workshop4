package rentACar.consoleUI;

import rentACar.dataAccess.abstracts.ICarDao;
import rentACar.dataAccess.concretes.InMemoryCarDao;
import rentACar.dataAccess.concretes.InMemoryCustomerDao;
import rentACar.entities.Car;
import rentACar.entities.Customer;
import rentACar.services.abstracts.CarService;
import rentACar.services.abstracts.CustomerService;
import rentACar.services.concretes.CarManager;
import rentACar.services.concretes.CustomerManager;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1, "Mavi", 1998);
        Car car2 = new Car(2, "Kırmızı", 2004);
        Car car3 = new Car(3, "Yeşil", 2012);

        ICarDao carDao = new InMemoryCarDao();

        CarService carService = new CarManager(new InMemoryCarDao());
        carService.add(car1);
        carService.delete(car1);

        CustomerService customerService = new CustomerManager(new InMemoryCustomerDao());
        customerService.add(new Customer("Ahmet", "Şahin", 15));
        customerService.getAll();
    }
}