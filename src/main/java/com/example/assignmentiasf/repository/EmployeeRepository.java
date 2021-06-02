package com.example.assignmentiasf.repository;

import com.example.assignmentiasf.entity.Employee;

import java.util.ArrayList;

public class EmployeeRepository {
    private static ArrayList<Employee> list = new ArrayList<>();

    public void createEmployee (Employee employee) {
        employee.setName(employee.getName());
        employee.setWage(employee.getWage());
        list.add(employee);
    }
    public ArrayList<Employee> getList() {
        return list;
    }
}
