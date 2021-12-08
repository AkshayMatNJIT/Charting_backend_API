package com.digitalhealthapp.charting.dao.impl;

import com.digitalhealthapp.charting.dao.EmployeeDao;
import com.digitalhealthapp.charting.models.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    public void insertEmployee(Employee cus) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("INSERT INTO doctors VALUES (?,?,?,?,?, now(), now())");
        ps.setString(1, cus.getDoc_id());
        ps.setInt(2, cus.getDoc_totalPatients());
        ps.setInt(3, cus.getDoc_departmentId());
        ps.setString(4, cus.getDoc_description());
        ps.setInt(5, cus.getDoc_yrsOfExp());
        ps.execute();
        System.out.println("Doctor details added: " + cus);
    }

    @Override
    public void insertEmployees(List<Employee> employees) {

    }

    @Override
    public List<Employee> getAllEmployees() throws SQLException {
        List<Employee> emp_list = new ArrayList<Employee>();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM doctors");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Employee emp = new Employee();
            emp.setDoc_id(rs.getString(1));
            emp.setDoc_totalPatients(rs.getInt(2));
            emp.setDoc_departmentId(rs.getInt(3));
            emp.setDoc_description(rs.getString(4));
            emp.setDoc_yrsOfExp(rs.getInt(5));
            emp_list.add(emp);
        }
        return emp_list;
    }

    @Override
    public Employee getEmployeeById(String empId) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM doctors WHERE doctorId = ?");
        ps.setString(1, empId);
        ResultSet rs = ps.executeQuery();
        Employee emp = new Employee();
        while (rs.next()) {
            emp.setDoc_id(rs.getString(1));
            emp.setDoc_totalPatients(rs.getInt(2));
            emp.setDoc_departmentId(rs.getInt(3));
            emp.setDoc_description(rs.getString(4));
            emp.setDoc_yrsOfExp(rs.getInt(5));
        }
        return emp;
    }
}
