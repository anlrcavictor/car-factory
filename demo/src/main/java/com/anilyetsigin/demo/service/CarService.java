package com.anilyetsigin.demo.service;

import com.anilyetsigin.demo.core.exception.InvalidTypeException;
import com.anilyetsigin.demo.entity.Car;
import com.anilyetsigin.demo.factory.CarFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarService {

    private final CarFactory carFactory;

    public String produceCar(String type) {
        return carFactory.produceCar(type).map(Car::getType).orElseThrow(InvalidTypeException::new);
    }
}
