package com.example.studentmanagementsystem.repository;

import com.example.studentmanagementsystem.dto.AdminDTO;
import com.example.studentmanagementsystem.model.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin,String> {

}
