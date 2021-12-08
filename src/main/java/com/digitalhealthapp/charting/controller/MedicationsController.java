package com.digitalhealthapp.charting.controller;

import com.digitalhealthapp.charting.models.LabReports;
import com.digitalhealthapp.charting.models.Medications;
import com.digitalhealthapp.charting.services.LabReportsService;
import com.digitalhealthapp.charting.services.MedicationsService;
import com.digitalhealthapp.charting.services.impl.LabReportsServiceImpl;
import com.digitalhealthapp.charting.services.impl.MedicationsServiceImpl;
import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
public class MedicationsController {

    MedicationsService medicationsService = new MedicationsServiceImpl();

    //URI: http://localhost:8080/medication?medicationid=2
    @RequestMapping(value = "/medication", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Object> getMedicationById(@RequestParam(required=true, defaultValue = "0", name = "medicationid") String medicationId){
        return ResponseEntity.ok().body(new Gson().toJson(medicationsService.getMedicationById(Integer.parseInt(medicationId))));
    }

    //URI: http://localhost:8080/addmedicationrecord
    @RequestMapping(value = "/addmedicationrecord", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<HttpStatus> addMedicationReport(@RequestBody String medication) throws SQLException {
        Medications mr = new Gson().fromJson(medication, Medications.class);
        medicationsService.insertMedication(mr);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
