package com.mgs.max_global_sports_employees.service;

import com.mgs.max_global_sports_employees.domain.EmployeeInformation;
import com.mgs.max_global_sports_employees.domain.req.EmployeeRequest;
import com.mgs.max_global_sports_employees.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    private EmployeeRepository repository;

    public List<EmployeeInformation> getEmployees() {
        return repository.findAll();
    }

    public String createEmployees(EmployeeRequest employeeRequest) {
        EmployeeInformation employeeInformation = EmployeeInformation.builder()
                .name(employeeRequest.getName())
                .allergies(employeeRequest.getAllergies())
                .cellPhone(employeeRequest.getCellPhone())
                .email(employeeRequest.getEmail())
                .healthProblems(employeeRequest.getHealthProblems())
                .build();

        this.repository.save(employeeInformation);
        return "Created";
    }




}
