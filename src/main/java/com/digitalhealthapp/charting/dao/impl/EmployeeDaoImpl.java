package com.digitalhealthapp.charting.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import com.digitalhealthapp.charting.dao.EmployeeDao;
import com.digitalhealthapp.charting.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize(){
        setDataSource(dataSource);
    }

    @Override
    public void insertEmployee(Employee emp) {
        String sql = "INSERT INTO doctors " + "(doc_id, doc_full_name, doc_email, doc_dept) VALUES (?,?,?,?)";
        assert getJdbcTemplate() != null;
        getJdbcTemplate().update(sql, emp.getDoc_id(), emp.getDoc_full_name(), emp.getDoc_email(), emp.getDoc_dept());
    }

    @Override
    public void insertEmployees(List<Employee> employees) {

    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee getEmployeeById(String empId) {
        String sql = "SELECT * FROM doctors WHERE doc_id = ?";
        return  (Employee)getJdbcTemplate().queryForObject(sql, new Object[]{empId}, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rwNumber) throws SQLException {
               Employee emp = new Employee();
               emp.setDoc_id(rs.getString("doc_id"));
               emp.setDoc_full_name(rs.getString("doc_full_name"));
               emp.setDoc_email(rs.getString("doc_email"));
               emp.setDoc_dept(rs.getString("doc_dept"));
               return emp;
            }
        });
    }
}
