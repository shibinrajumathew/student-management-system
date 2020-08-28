package com.example.studentmanagementsystem.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "admin")
@Data
public class Admin {
    private String name;
    String username;
    String address;
    String password;
}
