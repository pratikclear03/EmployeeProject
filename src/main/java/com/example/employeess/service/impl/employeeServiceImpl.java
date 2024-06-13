package com.example.employeess.service.impl;

import com.example.employeess.dto.employee;
import com.example.employeess.dto.employeeResponse;
import com.example.employeess.model.employeeModel;
import com.example.employeess.repository.employeeRepository;
import com.example.employeess.service.employeeService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class employeeServiceImpl implements employeeService {
    private final employeeRepository EmployeeRepository;
    public employeeResponse upload(employee Employee){
        return EmployeeRepository.saveEmployee(Employee);
    }
    public employeeModel getEmployee(String id){
        return EmployeeRepository.getEmployeeById(id);
    }

}
