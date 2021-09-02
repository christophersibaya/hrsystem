package com.sars.hrsystem.repository;

import com.sars.hrsystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findById(String id);

    Boolean existsByEmployeeNumber(String employeeNumber);

}