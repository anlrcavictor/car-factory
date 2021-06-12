package com.anilyetsigin.demo.factory;

import com.anilyetsigin.demo.entity.Cabrio;
import com.anilyetsigin.demo.entity.Car;
import com.anilyetsigin.demo.entity.Hatchback;
import com.anilyetsigin.demo.entity.Sedan;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class CarFactoryTest {

    @Autowired
    private CarFactory carFactory;

    @Test
    public void testCarFactory_isTypeHatchback() {
        Optional<Car> hatchback =  carFactory.produceCar("Hatchback");
        assertNotNull(hatchback);
        assertTrue(hatchback.get() instanceof Hatchback);
    }

    @Test
    public void testCarFactory_isTypeSedan() {
        Optional<Car> hatchback =  carFactory.produceCar("Sedan");
        assertNotNull(hatchback);
        assertTrue(hatchback.get() instanceof Sedan);
    }

    @Test
    public void testCarFactory_isTypeCabrio() {
        Optional<Car> hatchback =  carFactory.produceCar("Cabrio");
        assertNotNull(hatchback);
        assertTrue(hatchback.get() instanceof Cabrio);
    }

    @Test
    public void testCarFactory_isEmpty() {
        Optional<Car> hatchback =  carFactory.produceCar("Wagon");
        assertNotNull(hatchback);
        assertFalse(hatchback.isPresent());
    }

}
