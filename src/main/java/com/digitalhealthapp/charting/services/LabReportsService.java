package com.digitalhealthapp.charting.services;

import com.digitalhealthapp.charting.models.LabReports;

import java.sql.SQLException;
import java.util.List;

public interface LabReportsService {

    void insertLabReport(LabReports labReport) throws SQLException;
    void insertLabReports(List<LabReports> reports);
    List<LabReports> getAllLabReports() throws SQLException;
    LabReports getLabReportById(int reportId);
}
