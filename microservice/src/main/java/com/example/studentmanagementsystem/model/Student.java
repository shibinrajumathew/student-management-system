package com.example.studentmanagementsystem.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
@Data
public class Student {
    String name;
    int rollNo;
    String department;
    String address;
}
