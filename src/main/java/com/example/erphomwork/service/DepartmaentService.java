package com.example.erphomwork.service;


import com.example.erphomwork.model.Department;
import com.example.erphomwork.model.Employee;
import com.example.erphomwork.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmaentService {

    @Autowired
    DepartmentRepository departmentRepository ;

    public void addDepartment(Department dep){
        departmentRepository.save(dep);
    }

    public List<Department> getAll(){
        return departmentRepository.findAll();
    }

    public List<Department> findByEmployees(Employee emp){
        return departmentRepository.findByEmployees(emp);
    }


}
