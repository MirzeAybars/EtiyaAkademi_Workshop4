package rentACar.services.abstracts;

import rentACar.entities.Car;

import java.util.List;

public interface CarService {
    void add(Car car);

    List<Car> getAll();

    void delete(Car car);

    Car getById(int id);
}
