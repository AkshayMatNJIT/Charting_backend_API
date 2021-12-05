package com.digitalhealthapp.charting.dao.impl;

import com.digitalhealthapp.charting.dao.EmployeeDao;
import com.digitalhealthapp.charting.models.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    Connection connection;

    {
        try {
            connection = JDBCConnector.getInstance().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insertEmployee(Employee cus) {

    }

    @Override
    public void insertEmployees(List<Employee> employees) {

    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee getEmployeeById(String empId) throws SQLException, ClassNotFoundException {
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM doctors WHERE doctorId = ?");
        ps.setString(1, empId);
        ResultSet rs = ps.executeQuery();
        Employee emp = new Employee();
        while (rs.next()) {
            emp.setDoc_id(rs.getString(1));
            emp.setDoc_totalPatients(rs.getString(2));
            emp.setDoc_departmentId(rs.getString(3));
            emp.setDoc_specializationDept(rs.getString(4));
            emp.setDoc_description(rs.getString(5));
            emp.setDoc_yrsOfExp(rs.getString(6));
        }
        return emp;
    }
}
