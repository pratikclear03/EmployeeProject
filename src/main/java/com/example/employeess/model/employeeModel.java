package com.example.employeess.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.UUID;

@Data
@Document
@Builder
@AllArgsConstructor
public class employeeModel {

    private String id;
    private String name;
    private String email;
    private String department;
    private String designation;
    private String joinDate;
    public employeeModel(){
        this.id=UUID.randomUUID().toString();
    }

}

