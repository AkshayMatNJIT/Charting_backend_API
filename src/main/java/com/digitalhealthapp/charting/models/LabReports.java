package com.digitalhealthapp.charting.models;

import com.digitalhealthapp.charting.utilities.TimestampConverter;

import java.sql.Timestamp;
import java.util.Date;

public class LabReports {

  int patientId, doctorId, reportId;
  String reportName, worksheetFilepath, patientFilepath, description;

    Timestamp dueBy = new Timestamp(new Date().getTime());

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public Timestamp getDueBy() {
        return dueBy;
    }

    public void setDueBy(Timestamp dueBy) {
        this.dueBy = dueBy;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getWorksheetFilepath() {
        return worksheetFilepath;
    }

    public void setWorksheetFilepath(String worksheetFilepath) {
        this.worksheetFilepath = worksheetFilepath;
    }

    public String getPatientFilepath() {
        return patientFilepath;
    }

    public void setPatientFilepath(String patientFilepath) {
        this.patientFilepath = patientFilepath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
