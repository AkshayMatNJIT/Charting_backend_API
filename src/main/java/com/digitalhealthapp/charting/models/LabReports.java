package com.digitalhealthapp.charting.models;

public class LabReports {

  int patientId, doctorId, reportId;
  String reportName, worksheetFilepath, description;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
