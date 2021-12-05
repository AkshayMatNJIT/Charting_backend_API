package com.digitalhealthapp.charting.services.impl;
import com.digitalhealthapp.charting.dao.EmployeeDao;
import com.digitalhealthapp.charting.dao.impl.EmployeeDaoImpl;
import com.digitalhealthapp.charting.models.Employee;
import com.digitalhealthapp.charting.services.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao = new EmployeeDaoImpl();

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

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
    public ResponseEntity<Object> getEmployeeById(String empId) {
        Employee employee = null;
        try {
            employee = employeeDao.getEmployeeById(empId);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(employee);

        return null;
    }
}
