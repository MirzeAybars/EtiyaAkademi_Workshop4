package rentACar.services.concretes;

import rentACar.dataAccess.abstracts.ICarDao;
import rentACar.entities.Car;
import rentACar.services.abstracts.CarService;

import java.util.List;

public class CarManager implements CarService {

    private final ICarDao carDao;

    public CarManager(ICarDao carDao) {
        this.carDao = carDao;
    }


    @Override
    public void add(Car car) {
        if (car.getColor() == null) {
            System.out.println("Arabanın rengi olmalı..");
            return;
        }
        carDao.add(car);
    }

    @Override
    public List<Car> getAll() {
        return carDao.getAll();
    }

    @Override
    public void delete(Car car) {
        carDao.delete(car);
    }

    @Override
    public Car getById(int id) {
        return carDao.getById(id);
    }
}
