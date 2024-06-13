package com.example.employeess.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@RequiredArgsConstructor
public class employeeResponse {
//    @JsonProperty(value="userId")
    private String id;
    private String message;


}
