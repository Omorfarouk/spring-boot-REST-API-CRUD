package com.example.springbootbackend.service;

import com.example.springbootbackend.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee>getAllEmployee();
    Employee getEmployeeById(long id);
    Employee upateEmployee(Employee employee, long id);
    void  deleteEmployee(long id);
}
