package com.anilyetsigin.demo.controller;

import com.anilyetsigin.demo.entity.Sedan;
import com.anilyetsigin.demo.service.CarService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CarControllerTest {

    private CarService carService;
    private CarController carController;


    @Before
    public void setUp() {
        carService = mock(CarService.class);
        carController = new CarController(carService);
    }

    @Test
    public void testGetCarByType() {
        String carType = "Sedan";
        when(carService.produceCar(carType)).thenReturn(new Sedan().getType());
        ResponseEntity<String> responseEntity = carController.produceCarByType(carType);
        assertNotNull(responseEntity);
        assertEquals("Sedan", responseEntity.getBody());
    }

}
