package com.digitalhealthapp.charting.dao;

import com.digitalhealthapp.charting.models.LabReports;

import java.sql.SQLException;
import java.util.List;

public interface LabReportsDao {

    void insertLabReport(LabReports lab_report) throws SQLException;
    void insertLabReports(List<LabReports> lab_reports);
    List<LabReports> getAllLabReports() throws SQLException;
    LabReports getLabReportById(int reportId) throws SQLException;
}
