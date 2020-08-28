package com.example.studentmanagementsystem.service;

import com.example.studentmanagementsystem.dto.AdminDTO;
import com.example.studentmanagementsystem.model.Admin;
import com.example.studentmanagementsystem.repository.AdminRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
@Slf4j
@Service
public class AdminServiceImp implements AdminService {
    private AdminRepository repository;
    public AdminServiceImp(AdminRepository repository) {
        this.repository = repository;

    }

    @Override
    public ArrayList<Admin> insertAdmin(AdminDTO adminData) {
        Admin adminDTO = adminDTOOperation(adminData);
        Admin data = this.repository.insert(adminDTO);
        ArrayList<Admin> arrayData = new ArrayList<>();
        arrayData.add(data);
        log.info("name of admin:::::"+arrayData);
        return arrayData;
    }
    private Admin adminDTOOperation (AdminDTO adminDTO) {
        Admin admin = new Admin();
        log.info("name of admin:::::"+adminDTO.getName());
        admin.setName(adminDTO.getName());
        admin.setUsername(adminDTO.getUsername());
        admin.setAddress(adminDTO.getAddress());
        admin.setPassword(adminDTO.getPassword());
        return admin;

    }
}
