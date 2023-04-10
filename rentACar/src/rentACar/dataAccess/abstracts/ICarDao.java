package rentACar.dataAccess.abstracts;

import rentACar.entities.Car;

import java.util.List;

public interface ICarDao {

    void add(Car car);
    List<Car> getAll();
    void delete(Car car);
    Car getById(int id);

}
