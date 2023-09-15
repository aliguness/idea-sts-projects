package com.aligunes.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorMessage {

    private int code;
    private String message;
    @Builder.Default
    private LocalDateTime date=LocalDateTime.now();

}
