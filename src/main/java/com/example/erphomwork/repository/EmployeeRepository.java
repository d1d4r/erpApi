package com.example.erphomwork.repository;

import com.example.erphomwork.model.Department;
import com.example.erphomwork.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    @Query("SELECT e FROM Employee e WHERE e.jobTitle = :jobTitle")
    List<Employee> findByJobTitle(@Param("jobTitle") String jobTitle);



    @Procedure("calculate_tax")
    Integer calculateTax(@Param("income") Integer income);



    @Query(value = "SELECT getemployeecount(:deptId)", nativeQuery = true)
    Integer getEmployeeCount(@Param("deptId") int departmentId);
}
