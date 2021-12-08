package com.digitalhealthapp.charting.controller;

import com.digitalhealthapp.charting.models.LabReports;
import com.digitalhealthapp.charting.services.LabReportsService;
import com.digitalhealthapp.charting.services.impl.LabReportsServiceImpl;
import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
public class LabReportsController {

    LabReportsService labReportsService = new LabReportsServiceImpl();

    //URI: http://localhost:8080/labreport?reportid=2
    @RequestMapping(value = "/labreport", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Object> getLabReportById(@RequestParam(required=true, defaultValue = "2", name = "reportid") String reportId){
        return ResponseEntity.ok().body(new Gson().toJson(labReportsService.getLabReportById(Integer.parseInt(reportId))));
    }

    //URI: http://localhost:8080/addlabreport
    @RequestMapping(value = "/addlabreport", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<HttpStatus> addLabReport(@RequestBody String labReport) throws SQLException {
        LabReports lr = new Gson().fromJson(labReport, LabReports.class);
        labReportsService.insertLabReport(lr);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
