package com.example.studentmanagementsystem.service;

import com.example.studentmanagementsystem.dto.AdminDTO;
import com.example.studentmanagementsystem.model.Admin;

import java.util.ArrayList;

public interface AdminService {
    ArrayList<Admin> insertAdmin(AdminDTO adminData);
}
