package com.digitalhealthapp.charting.dao;

import com.digitalhealthapp.charting.models.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {

    void insertEmployee(Employee cus);
    void insertEmployees(List<Employee> employees);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(String empId) throws SQLException, ClassNotFoundException;
}
