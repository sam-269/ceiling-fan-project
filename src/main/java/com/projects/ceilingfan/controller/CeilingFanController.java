package com.projects.ceilingfan.controller;

import com.projects.ceilingfan.service.CeilingFanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class CeilingFanController {

    @Autowired
    private CeilingFanService fanService;

    @GetMapping("changespeed")
    public int changeSpeed(){
        return fanService.changeSpeed();
    }

    @GetMapping("reversespeed")
    public String reverseSpeed(){
        return  fanService.reverseSpeed();
    }
}
