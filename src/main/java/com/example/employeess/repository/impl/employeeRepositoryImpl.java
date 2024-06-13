package com.example.employeess.repository.impl;

import com.example.employeess.dto.employee;
import com.example.employeess.dto.employeeResponse;
import com.example.employeess.model.employeeModel;
import com.example.employeess.repository.employeeCustomRepository;
import com.example.employeess.repository.employeeRepository;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Builder
@RequiredArgsConstructor

public class employeeRepositoryImpl implements employeeCustomRepository {
    private final MongoTemplate  mongotemplate;
    @Override
    public employeeResponse saveEmployee(employee Employee) {
        employeeResponse EmployeeResponse = new employeeResponse();
        employeeModel EmployeeModel = new employeeModel();
        EmployeeModel.setName(Employee.getName());
        EmployeeModel.setEmail(Employee.getEmail());
        EmployeeModel.setDepartment(Employee.getDepartment());
        EmployeeModel.setDesignation(Employee.getDesignation());
        EmployeeModel.setJoinDate(Employee.getJoinDate());

        mongotemplate.insert(EmployeeModel);



        EmployeeResponse.setId(EmployeeModel.getId());
        EmployeeResponse.setMessage("Created Successfully");
        return EmployeeResponse;
    }

}
