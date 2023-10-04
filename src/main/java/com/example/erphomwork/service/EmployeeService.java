package com.example.erphomwork.service;


import com.example.erphomwork.model.Department;
import com.example.erphomwork.model.Employee;
import com.example.erphomwork.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public void addEmployee(Employee emp){
        employeeRepository.save(emp);
    }

    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

    public List<Employee> findByJobTitle(String jobTitle){
        return employeeRepository.findByJobTitle(jobTitle);
    }



    public Integer calculateTax(Integer income) {
        return employeeRepository.calculateTax(income);

    }



    public Integer getEmployeeCount(Integer depId) {
        return employeeRepository.getEmployeeCount(depId);

    }

}
