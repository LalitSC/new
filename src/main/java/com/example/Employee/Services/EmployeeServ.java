package com.example.Employee.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Employee.Model.EmployeeModel;
import com.example.Employee.Repository.EmployeeRepo;
import com.example.Employee.exception.EmployeeNotFoundException;

@Service
public class EmployeeServ {

    @Autowired
    private EmployeeRepo repository;

    public List<EmployeeModel> getAllEmployees() {
        return repository.findAll();
    }

    public EmployeeModel addEmployee(EmployeeModel employee) {
        return repository.save(employee);
    }

    public String updateEmployee(Integer id, EmployeeModel employee) {
    	
        Optional<EmployeeModel> existingEmployee = repository.findById(id);
        if (!existingEmployee.isPresent()) {
        	
        	throw new EmployeeNotFoundException("No employee present with id =" +id);
            //return "No Employee found with the provided ID.";
        }

        EmployeeModel emp = existingEmployee.get();
        emp.setFirstName(employee.getFirstName());
        emp.setLastName(employee.getLastName());
        emp.setEmail(employee.getEmail());

        repository.save(emp);
        return "Employee updated successfully!";
    }

    public String addEmployees(List<EmployeeModel> employees) {
        repository.saveAll(employees);
        return "All employee records successfully added to the DB!";
    }
}
