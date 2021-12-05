package com.digitalhealthapp.charting.controller;

import com.digitalhealthapp.charting.models.Employee;
import com.digitalhealthapp.charting.services.EmployeeService;
import com.digitalhealthapp.charting.services.impl.EmployeeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    EmployeeService employeeService = new EmployeeServiceImpl();

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String indexPage() {
        return "eCR application dashboard";
    }

    //URI Ex: http://localhost:8080/employee?empid=45623
    @RequestMapping(value = "/doctor", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Object> getEmployeeById(@RequestParam String empid){
        return employeeService.getEmployeeById(empid);
    }

    @RequestMapping(value = "/addemployee", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<HttpStatus> addEmployee(@RequestBody Employee emp){
        employeeService.insertEmployee(emp);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
