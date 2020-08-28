package com.example.studentmanagementsystem.exceptions.handler;

import com.example.studentmanagementsystem.exceptions.model.EntityNotFoundException;
import com.example.studentmanagementsystem.util.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
    @Autowired
    CustomResponse customResponse;
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<?> handleServiceException (EntityNotFoundException  enf) {
        return  customResponse.setFailedData(enf.getMessage(), HttpStatus.NOT_FOUND);
    }
}