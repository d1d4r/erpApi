package com.example.erphomwork.controller;

import com.example.erphomwork.model.Department;
import com.example.erphomwork.model.Employee;
import com.example.erphomwork.service.DepartmaentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("department")
public class DepartmentController {

    @Autowired
    DepartmaentService departmaentService;

    @PostMapping ("/add")
    public void add(@RequestBody Department dep){
        departmaentService.addDepartment(dep);
    }

    @GetMapping("/get")
    public List<Department> get(){
        return departmaentService.getAll();
    }


    @GetMapping("/getemp")
    public List<Department> findByEmployees(@RequestBody Employee emp){
        return departmaentService.findByEmployees(emp);
    }

}
