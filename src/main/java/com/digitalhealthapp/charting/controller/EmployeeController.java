package com.digitalhealthapp.charting.controller;

import com.digitalhealthapp.charting.models.Employee;
import com.digitalhealthapp.charting.services.EmployeeService;
import com.digitalhealthapp.charting.services.impl.EmployeeServiceImpl;
import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
public class EmployeeController {

    EmployeeService employeeService = new EmployeeServiceImpl();

    //URI Ex: http://localhost:8080/employee?empid=45623
    @RequestMapping(value = "/doctor", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Object> getEmployeeById(@RequestParam String empid){
        return ResponseEntity.ok().body(new Gson().toJson(employeeService.getEmployeeById(empid)));
    }

    @RequestMapping(value = "/addemployee", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<HttpStatus> addEmployee(@RequestBody Employee emp) throws SQLException {
        employeeService.insertEmployee(emp);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
