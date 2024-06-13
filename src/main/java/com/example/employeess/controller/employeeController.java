package com.example.employeess.controller;


import com.example.employeess.dto.employee;
import com.example.employeess.dto.employeeResponse;
import com.example.employeess.model.employeeModel;
import com.example.employeess.service.employeeService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
@Slf4j
@RestController
@RequiredArgsConstructor
public class employeeController {
    private final employeeService EmployeeService ;
    @PostMapping (path="/upload")
    public employeeResponse uploadFile(@RequestBody employee emp){

        return EmployeeService.upload(emp);
    }

    @GetMapping (path="/employee")
    public employeeModel getEmployee(@RequestParam String id){
        log.info("entered");
        return EmployeeService.getEmployee(id);


    }




}
