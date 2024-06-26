package com.mgs.max_global_sports_employees.controller;

import com.mgs.max_global_sports_employees.domain.EmployeeInformation;
import com.mgs.max_global_sports_employees.domain.req.EmployeeRequest;
import com.mgs.max_global_sports_employees.service.EmployeeService;
import jdk.jshell.Snippet;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;


    @GetMapping("/information")
    public ResponseEntity<List<EmployeeInformation>> get() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getEmployees());

    }

    @PostMapping("/information-create")
    public ResponseEntity<String> post(@RequestBody EmployeeRequest employeeRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createEmployees(employeeRequest));
    }
}
