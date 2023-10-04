package com.example.erphomwork.repository;

import com.example.erphomwork.model.Department;
import com.example.erphomwork.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ManagerRepository extends JpaRepository<Manager,Integer> {

    @Query("SELECT m FROM Manager m WHERE m.salary = (SELECT MAX(m2.salary) FROM Manager m2)")
    Manager findHighestPaidManager();
}
