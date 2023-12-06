package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    private List<Car> listCar;

    @Override
    public List<Car> getCars(int quantity) {
        if (listCar == null) {
            listCar = new ArrayList<>();
            listCar.add(new Car("model1", 11, "black"));
            listCar.add(new Car("model2", 22, "white"));
            listCar.add(new Car("model3", 33, "blue"));
            listCar.add(new Car("model4", 44, "green"));
            listCar.add(new Car("model5", 55, "red"));
        }
        return quantity > listCar.size() ? listCar : new ArrayList<>(listCar.subList(0, quantity));
    }
}
