package com.digitalhealthapp.charting.controller;

import com.digitalhealthapp.charting.models.Employee;
import com.digitalhealthapp.charting.models.LabReports;
import com.digitalhealthapp.charting.services.EmployeeService;
import com.digitalhealthapp.charting.services.LabReportsService;
import com.digitalhealthapp.charting.services.impl.EmployeeServiceImpl;
import com.digitalhealthapp.charting.services.impl.LabReportsServiceImpl;
import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
public class LabReportsController {

    LabReportsService labReportsService = new LabReportsServiceImpl();

    //URI: http://localhost:8080/employee?empid=45623
    @RequestMapping(value = "/labreport", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Object> getLabReportById(@RequestParam int reportId){
        return ResponseEntity.ok().body(new Gson().toJson(labReportsService.getLabReportById(reportId)));
    }

    //URI: http://localhost:8080/addlabreport
    @RequestMapping(value = "/addlabreport", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<HttpStatus> addLabReport(@RequestBody LabReports labReport) throws SQLException {
        labReportsService.insertLabReport(labReport);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
