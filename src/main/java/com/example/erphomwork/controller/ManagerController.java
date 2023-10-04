package com.example.erphomwork.controller;

import com.example.erphomwork.model.Employee;
import com.example.erphomwork.model.Manager;
import com.example.erphomwork.service.EmployeeService;
import com.example.erphomwork.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("manager")
public class ManagerController {

    @Autowired
    ManagerService managerService;
    @PostMapping("/add")
    public void add(@RequestBody Manager mng){
        managerService.addManager(mng);
    }

    @GetMapping("/get")
    public List<Manager> get(){
        return managerService.getAll();
    }

    @GetMapping("/highestpaid")
    public Manager findHighestPaidManager(){
        return managerService.findHighestPaidManager();
    }
}
