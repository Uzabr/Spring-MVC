package web.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Component
public class Car {
    private int carNumber;
    private String  carModel;
    private String  carType;

    public Car () {
    }

    public Car (int carNumber, String carModel, String carType) {
        this.carNumber = carNumber;
        this.carModel = carModel;
        this.carType = carType;
    }

    public int getCarNumber () {
        return carNumber;
    }

    public void setCarNumber (int carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarModel () {
        return carModel;
    }

    public void setCarModel (String carModel) {
        this.carModel = carModel;
    }

    public String getCarType () {
        return carType;
    }

    public void setCarType (String carType) {
        this.carType = carType;
    }

    @Override
    public String toString () {
        return "CarController{" +
                "carNumber=" + carNumber +
                ", carModel='" + carModel + '\'' +
                ", carType='" + carType + '\'' +
                '}';
    }

}
