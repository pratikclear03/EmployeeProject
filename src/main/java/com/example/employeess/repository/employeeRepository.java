package com.example.employeess.repository;

import com.example.employeess.dto.employee;
import com.example.employeess.dto.employeeResponse;
import com.example.employeess.model.employeeModel;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface employeeRepository extends MongoRepository<employeeModel,String>,employeeCustomRepository{
   public employeeModel getEmployeeById(String id);

}
