package com.example.assignmentiasf.controller;

import com.example.assignmentiasf.entity.Employee;
import com.example.assignmentiasf.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    private EmployeeRepository employeeRepository = new EmployeeRepository();

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private List<Employee> findAllEmployees(){
        return employeeRepository.getList();
    }
    @RequestMapping(method = RequestMethod.POST)
    private Employee createEmployee(@RequestBody Employee employee){
        employeeRepository.createEmployee(employee);
        return employee;
    }
}
