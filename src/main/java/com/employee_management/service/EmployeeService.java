package com.employee_management.service;

import com.employee_management.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int employeeNumber);

    Employee save(Employee employee);

    Employee update(Employee employee);

    void deleteById(int employeeNumber);


}
