package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final CarDao cars;

    @Autowired
    public CarServiceImp(CarDao cars) {
        this.cars = cars;
    }

    @Override
    public List<Car> getCars(int quantity) {
        return cars.getCars(quantity);
    }
}
