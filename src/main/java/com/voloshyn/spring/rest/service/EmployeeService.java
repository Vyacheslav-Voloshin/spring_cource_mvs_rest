package com.voloshyn.spring.rest.service;

import com.voloshyn.spring.rest.entity.Employee;;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
