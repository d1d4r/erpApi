package com.example.erphomwork.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Department")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String name;


    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "manager_id", unique = true)
    private Manager manager;

    @JsonManagedReference
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
}
