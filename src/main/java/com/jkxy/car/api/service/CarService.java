package com.jkxy.car.api.service;

import com.jkxy.car.api.pojo.Car;

import java.util.List;


public interface CarService {

    List<Car> findAll();

    Car findById(int id);

    List<Car> findByCarName(String carName);

    List<Car> findByCarNamePro(String carName);

    void deleteById(int id);

    void updateById(Car car);

    void insertCar(Car car);

    String buyCar(String carId);
}
