package com.digitalhealthapp.charting.services;
import com.digitalhealthapp.charting.models.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService {

    void insertEmployee(Employee emp);
    void insertEmployees(List<Employee> employees);
    void getAllEmployees();
    ResponseEntity<Object> getEmployeeById(String empid);
}
