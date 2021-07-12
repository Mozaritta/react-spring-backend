package com.exp.react.controller;

import com.exp.react.model.Employee;
import com.exp.react.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;
    
    @GetMapping(value="/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @PostMapping("/employees")
    public Employee CreateEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    
    
}
