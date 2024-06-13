package com.example.employeess.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class employee {
    private String name;
    private String email;
    private String department;
    private String designation;
    private String joinDate;
}
