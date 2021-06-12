package com.anilyetsigin.demo.controller;

import com.anilyetsigin.demo.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "car-factory")
public class CarController {

    private final CarService carService;

    @PostMapping
    public ResponseEntity<String> produceCarByType(String type) {
        return ResponseEntity.ok(carService.produceCar(type));
    }

}
