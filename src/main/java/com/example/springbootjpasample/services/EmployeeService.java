package com.example.springbootjpasample.services;

import com.example.springbootjpasample.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
    Employee getById(Long id);
    Employee add(Employee employee);
    void deleteById(Long id);
}
