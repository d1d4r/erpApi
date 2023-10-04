package com.example.erphomwork.controller;

import com.example.erphomwork.model.Department;
import com.example.erphomwork.model.Employee;
import com.example.erphomwork.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @PostMapping("/add")
    public void add(@RequestBody Employee emp){
        employeeService.addEmployee(emp);
    }

    @GetMapping("/get")
    public List<Employee> get(){
        return employeeService.getAll();
    }

    @GetMapping("/get-title")
    public List<Employee> findByJobTitle(@RequestParam String jobTitle){
       return employeeService.findByJobTitle(jobTitle);
    }

    @GetMapping("/calculate-tax")
    public Integer calculateTax(@RequestParam Integer income) {
        return employeeService.calculateTax(income);
    }




    @GetMapping("/emp-count")
    public Integer getEmployeeCount(@RequestParam Integer empId) {
        return employeeService.getEmployeeCount(empId);
    }


}
