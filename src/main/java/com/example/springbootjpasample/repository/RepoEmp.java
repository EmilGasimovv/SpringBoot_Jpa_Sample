package com.example.springbootjpasample.repository;

import com.example.springbootjpasample.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoEmp extends JpaRepository<Employee,Long> {
}
