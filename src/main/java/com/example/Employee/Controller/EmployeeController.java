package com.example.Employee.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Employee.Model.EmployeeModel;
import com.example.Employee.Services.EmployeeServ;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeServ employeeService;

    @GetMapping("/employees")
    public List<EmployeeModel> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("/employees")
    public EmployeeModel addEmployee(@RequestBody EmployeeModel employee) {
        return employeeService.addEmployee(employee);
    }

    @PostMapping("/employees/all")
    public String addEmployees(@RequestBody List<EmployeeModel> employees) {
        return employeeService.addEmployees(employees);
    }

    @PutMapping("/employees/{id}")
    public String updateEmployee(@PathVariable Integer id, @RequestBody EmployeeModel employee) {
        return employeeService.updateEmployee(id, employee);
    }
}
