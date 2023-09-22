package com.example.springbootjpasample.controller;

import com.example.springbootjpasample.entity.Employee;
import com.example.springbootjpasample.manager.EmployeeManage;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeManage employeeManage;

    @GetMapping("/employee")
    public List<Employee> getAll(){
        return employeeManage.getAll();
    }
    @GetMapping("/{id}")
    public Employee getById(@PathVariable Long id){
        return employeeManage.getById(id);
    }
    @PostMapping("/employee")
    public Employee add(@RequestBody Employee employee){
        return employeeManage.add(employee);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        employeeManage.deleteById(id);
    }

}
