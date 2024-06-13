package com.example.employeess.repository;

import com.example.employeess.dto.employee;
import com.example.employeess.dto.employeeResponse;
import com.example.employeess.model.employeeModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface employeeCustomRepository{


    employeeResponse saveEmployee(employee Employee);
}
