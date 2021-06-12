package com.anilyetsigin.demo.controller.handler;


import com.anilyetsigin.demo.core.dto.ErrorResponseDto;
import com.anilyetsigin.demo.core.exception.InvalidTypeException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
@Slf4j
public class ExceptionHandlerController {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ErrorResponseDto> handleAllExceptions(Exception e) {
        log.error("Unpredicted Exception {} ", e.getMessage());
        return new ResponseEntity<>(ErrorResponseDto.builder().date(LocalDateTime.now()).message(e.getLocalizedMessage()).build(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(InvalidTypeException.class)
    public final ResponseEntity<Object> handleInvalidTypeException(InvalidTypeException e) {
        log.error("Invalid Car Type --> {} ", e.getMessage());
        return new ResponseEntity<>(ErrorResponseDto.builder().date(LocalDateTime.now()).message(e.getLocalizedMessage()).build(), HttpStatus.BAD_REQUEST);
    }

}
