package com.example.erphomwork.controller;


import com.example.erphomwork.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("database")
public class DatabaseController {

    @Autowired
    DatabaseService databaseService;

    @DeleteMapping("/del")
    public void delete(){
        databaseService.deleteAllTables();
    }



}
