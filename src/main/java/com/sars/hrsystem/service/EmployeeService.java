package com.sars.hrsystem.service;

import com.sars.hrsystem.model.Employee;
import com.sars.hrsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }

    public Optional<Employee> findEmployeeById(long id){
        return employeeRepository.findById(id);
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeNumber(UUID.randomUUID().toString());//generate a random number as an employee number
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(long id){
        employeeRepository.deleteById(id);
    }

    public boolean employeeExistsByEmployeeNumber(String employeeNumber){
        return employeeRepository.existsByEmployeeNumber(employeeNumber);
    }
}
