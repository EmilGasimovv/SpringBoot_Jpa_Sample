package com.example.springbootjpasample.manager;

import com.example.springbootjpasample.entity.Employee;
import com.example.springbootjpasample.repository.RepoEmp;
import com.example.springbootjpasample.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EmployeeManage implements EmployeeService {
   private final RepoEmp repoEmp;
    @Override
    public List<Employee> getAll() {
        return repoEmp.findAll();
    }

    @Override
    public Employee getById(Long id) {
        return repoEmp.findById(id).get();
    }

    @Override
    public Employee add(Employee employee) {
        return repoEmp.save(employee);
    }

    @Override
    public void deleteById(Long id) {
      repoEmp.deleteById(id);
    }
}
