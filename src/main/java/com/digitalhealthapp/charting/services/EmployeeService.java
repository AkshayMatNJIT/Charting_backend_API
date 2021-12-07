package com.digitalhealthapp.charting.services;
import com.digitalhealthapp.charting.models.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeService {

    void insertEmployee(Employee emp) throws SQLException;
    void insertEmployees(List<Employee> employees);
    void getAllEmployees();
    Employee getEmployeeById(String empid);
}
