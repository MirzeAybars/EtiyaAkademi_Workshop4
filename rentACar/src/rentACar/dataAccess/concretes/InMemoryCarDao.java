package rentACar.dataAccess.concretes;

import rentACar.dataAccess.abstracts.ICarDao;
import rentACar.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCarDao implements ICarDao {
    List<Car> cars = new ArrayList<>();

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> getAll() {
        return cars;
    }

    @Override
    public void delete(Car car) {
        cars.remove(car);
    }

    @Override
    public Car getById(int id) {
        return cars.stream().filter(car -> car.getId() == id).findFirst().orElseThrow();
    }
}
