package com.digitalhealthapp.charting.services;
import com.digitalhealthapp.charting.models.Employee;

import java.util.List;

public interface EmployeeService {

    void insertEmployee(Employee emp);
    void insertEmployees(List<Employee> employees);
    void getAllEmployees();
    Employee getEmployeeById(String empid);
}
