package com.example.studentmanagementsystem.controller;

import com.example.studentmanagementsystem.dto.AdminDTO;
import com.example.studentmanagementsystem.exceptions.model.EntityNotFoundException;
import com.example.studentmanagementsystem.facade.AdminFacade;
import com.example.studentmanagementsystem.facade.AdminFacadeImp;
import com.example.studentmanagementsystem.model.Admin;
import com.example.studentmanagementsystem.util.CustomResponse;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@Slf4j
@RestController
@RequestMapping("api")
@Api(tags="Student management system")
public class SmsController {

    @Autowired
    CustomResponse customResponse;
    @Autowired
    AdminFacade adminFacadeImp;
    //admin controllers
    @RequestMapping(value = "/registerAdmin", produces = "application/json", method = RequestMethod.POST)
    public ResponseEntity<?> insertAdmin (@RequestBody final AdminDTO adminData) {

        ArrayList<Admin> resData = adminFacadeImp.insertAdmin(adminData);
        if(resData == null) throw new EntityNotFoundException("No results found, result:"+resData);
        return  customResponse.setSuccessData(resData);

    }
    @RequestMapping(value = "/getAdminData", produces = "application/text", method = RequestMethod.GET)
    public String getAdminData () {
        return "5f491ca05e42ad17d831e814";

    }
    //students controllers
    @RequestMapping(value = "/insertStudentData", produces = "application/text", method = RequestMethod.POST)
    public String insertStudentData () {
        return "initial data";

    }
    @RequestMapping(value = "/getStudentsData", produces = "application/text", method = RequestMethod.GET)
    public String getStudentsData () {
        return "initial data";

    }
    @RequestMapping(value = "/updateStudentData", produces = "application/text", method = RequestMethod.PUT)
    public String updateStudentData () {
        return "initial data";

    }
    @RequestMapping(value = "/deleteStudentData", produces = "application/text", method = RequestMethod.DELETE)
    public String deleteStudentData () {
        return "initial data";

    }
}
