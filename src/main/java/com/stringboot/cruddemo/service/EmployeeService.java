package com.stringboot.cruddemo.service;

import com.stringboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee findById(int id);

    void save(Employee employee);

    void delete(int id);
}
