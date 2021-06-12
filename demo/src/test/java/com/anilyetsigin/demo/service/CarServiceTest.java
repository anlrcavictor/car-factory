package com.anilyetsigin.demo.service;

import com.anilyetsigin.demo.core.exception.InvalidTypeException;
import com.anilyetsigin.demo.entity.Hatchback;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CarServiceTest {

    @Autowired
    CarService carService;

    @Test
    public void testCarService_isThrowExpectedEx() {
        String carType = "";
        Throwable exception = assertThrows(InvalidTypeException.class, () -> { carService.produceCar(carType); });
        assertEquals("Invalid type has been given, Please use one of following: Sedan, Cabrio, Coupe ", exception.getMessage());
    }

    @Test
    public void testCarService_IsCarTypeNotNull_IsCarTypeCorrect() {
        String carType = "Hatchback";
        assertNotNull(carService.produceCar(carType));
        assertEquals(carType, carService.produceCar(carType));
    }










}
