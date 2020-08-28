package com.example.studentmanagementsystem.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@Api(tags="Student management system")
public class SmsController {
    @RequestMapping(value = "/getStudentsData", produces = "application/text", method = RequestMethod.GET)
    public String getStudentsData () {
        return "initial data";

    }
}
