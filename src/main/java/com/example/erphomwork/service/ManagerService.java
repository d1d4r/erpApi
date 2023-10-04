package com.example.erphomwork.service;

import com.example.erphomwork.model.Department;
import com.example.erphomwork.model.Manager;
import com.example.erphomwork.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {

    @Autowired
    ManagerRepository managerRepository;

    public void addManager(Manager mng){
        managerRepository.save(mng);
    }

    public List<Manager> getAll(){
        return managerRepository.findAll();
    }

    public Manager findHighestPaidManager(){
        return managerRepository.findHighestPaidManager();
    }
}
