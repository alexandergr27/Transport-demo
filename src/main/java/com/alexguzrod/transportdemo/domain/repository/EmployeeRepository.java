package com.alexguzrod.transportdemo.domain.repository;

import com.alexguzrod.transportdemo.domain.model.Employee;

import java.util.List;

public interface EmployeeRepository {

    Employee getEmployee(Long employeeId);

    List<Employee> getAllEmployees();

    Employee saveEmployee(Employee employee);

    Employee updateEmployee(Employee employee);
}
