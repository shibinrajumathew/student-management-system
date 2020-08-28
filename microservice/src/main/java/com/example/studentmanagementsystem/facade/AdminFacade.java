package com.example.studentmanagementsystem.facade;

import com.example.studentmanagementsystem.dto.AdminDTO;
import com.example.studentmanagementsystem.model.Admin;

import java.util.ArrayList;

public interface AdminFacade {
    ArrayList<Admin> insertAdmin (AdminDTO adminData);
}
