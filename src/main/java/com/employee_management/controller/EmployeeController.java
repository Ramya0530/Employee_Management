package com.employee_management.controller;

import com.employee_management.entity.Employee;
import com.employee_management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @GetMapping("/findAll")
    public List<Employee> findAll() {
        return service.findAll();
    }

    @GetMapping("/findById/{employeeNumber}")
    public Employee findById(@PathVariable int employeeNumber) {
        return service.findById(employeeNumber);

    }

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee) {
        return service.save(employee);
    }

    @PutMapping("/update")
    public Employee update(@RequestBody Employee employee) {
        return service.update(employee);

    }

    @DeleteMapping("/delete/{employeeNumber}")
    public void deleteById(@PathVariable int employeeNumber) {
        service.deleteById(employeeNumber);

    }

}
