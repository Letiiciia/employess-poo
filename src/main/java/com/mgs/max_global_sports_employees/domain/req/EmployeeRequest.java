package com.mgs.max_global_sports_employees.domain.req;

import lombok.Data;

@Data
public class EmployeeRequest {
    private String name;
    private String healthProblems;
    private String allergies;
    private String email;
    private String cellPhone;
}
