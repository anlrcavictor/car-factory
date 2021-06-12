package com.anilyetsigin.demo.entity;

import com.anilyetsigin.demo.core.Constants.CarConstants;

public class Sedan implements Car {

    @Override
    public String getType() {
        return CarConstants.SEDAN;
    }

}