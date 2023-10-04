package com.example.erphomwork.repository;

import com.example.erphomwork.model.Department;
import com.example.erphomwork.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {

    @Query("SELECT d FROM Department d JOIN d.employees e WHERE e = :employee")
    List<Department> findByEmployees(@Param("employee") Employee employee);
}
