package com.example.studentmanagementsystem.facade;

import com.example.studentmanagementsystem.dto.AdminDTO;
import com.example.studentmanagementsystem.model.Admin;
import com.example.studentmanagementsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class AdminFacadeImp implements AdminFacade {
    @Autowired
    AdminService adminService;
    @Override
    public ArrayList<Admin> insertAdmin(AdminDTO adminData) {
        return adminService.insertAdmin(adminData);
    }
}
