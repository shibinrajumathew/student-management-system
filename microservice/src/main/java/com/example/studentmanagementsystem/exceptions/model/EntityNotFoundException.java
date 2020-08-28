package com.example.studentmanagementsystem.exceptions.model;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String message) {
        super(message);
    }
}