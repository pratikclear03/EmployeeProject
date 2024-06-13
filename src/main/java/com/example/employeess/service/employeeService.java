package com.example.employeess.service;

import com.example.employeess.dto.employee;
import com.example.employeess.dto.employeeResponse;
import com.example.employeess.model.employeeModel;
import com.example.employeess.repository.employeeCustomRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface employeeService{
public employeeResponse upload(employee Employee);
public employeeModel getEmployee(String id);

}
