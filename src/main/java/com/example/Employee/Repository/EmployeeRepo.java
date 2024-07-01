package com.example.Employee.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Employee.Model.EmployeeModel;


public interface EmployeeRepo extends JpaRepository<EmployeeModel, Integer> {

}
