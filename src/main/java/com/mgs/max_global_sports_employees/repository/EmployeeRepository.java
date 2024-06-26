package com.mgs.max_global_sports_employees.repository;

import com.mgs.max_global_sports_employees.domain.EmployeeInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeInformation, Long> {




}
