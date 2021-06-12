package com.anilyetsigin.demo.core.exception;

import com.anilyetsigin.demo.core.Constants.Messages;
import org.springframework.stereotype.Component;


public class InvalidTypeException extends RuntimeException{

    public InvalidTypeException(){
        super(Messages.INVALID_TYPE);
    }
}
