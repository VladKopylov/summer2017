package com.kopylov.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.I_AM_A_TEAPOT, reason = "Im newest in Spring")
public class StrangeException extends RuntimeException {
    private static final long serialVersionUID = -3332292346834265371L;

    public StrangeException(String message){
        super(message);
    }
}
