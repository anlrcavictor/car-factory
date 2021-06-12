package com.anilyetsigin.demo.factory;

import com.anilyetsigin.demo.core.Constants.CarConstants;
import com.anilyetsigin.demo.core.exception.InvalidTypeException;
import com.anilyetsigin.demo.entity.Cabrio;
import com.anilyetsigin.demo.entity.Car;
import com.anilyetsigin.demo.entity.Hatchback;
import com.anilyetsigin.demo.entity.Sedan;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CarFactory {

    public Optional<Car> produceCar(String type) {



        switch (type) {
            case CarConstants.CABRIO:
                return Optional.of(new Cabrio());
            case CarConstants.SEDAN:
                return Optional.of(new Sedan());
            case CarConstants.HATCHBACK:
                return Optional.of(new Hatchback());
            default:
                return Optional.empty();
        }


    }
}
