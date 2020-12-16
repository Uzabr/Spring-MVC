package web.service;

import web.controller.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{
    List<Car> cars = new ArrayList<>();
    @Override
    public List<Car> carTake (Integer amount) {
        cars.add(new Car(1, "Mercedes", "sedan"));
        cars.add(new Car(2, "Reno", "sedan"));
        cars.add(new Car(3, "AUDI", "sedan"));
        cars.add(new Car(4, "BMW", "sedan"));
        cars.add(new Car(5, "Volvo", "sedan"));

        List<Car> carList = cars.stream()
                                .filter(x -> x.getCarNumber() <= amount)
                                .collect(Collectors.toList());
        return amount < 0 || amount >= 5 ? cars : carList;
    }
}
