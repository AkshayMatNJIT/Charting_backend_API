package com.digitalhealthapp.charting.services.impl;
import com.digitalhealthapp.charting.dao.EmployeeDao;
import com.digitalhealthapp.charting.models.Employee;
import com.digitalhealthapp.charting.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public void insertEmployee(Employee emp) {
        employeeDao.insertEmployee(emp);
    }

    @Override
    public void insertEmployees(List<Employee> employees) {

    }

    @Override
    public void getAllEmployees() {

    }

    @Override
    public void getEmployeeById(String empId) {
        Employee employee = employeeDao.getEmployeeById(empId);
        System.out.println(employee);

    }
}
