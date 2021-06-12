package com.anilyetsigin.demo.core.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ErrorResponseDto {

    private LocalDateTime date;
    private String message;

}

