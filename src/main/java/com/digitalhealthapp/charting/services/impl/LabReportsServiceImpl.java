package com.digitalhealthapp.charting.services.impl;

import com.digitalhealthapp.charting.dao.LabReportsDao;
import com.digitalhealthapp.charting.dao.impl.LabReportsDaoImpl;
import com.digitalhealthapp.charting.models.Employee;
import com.digitalhealthapp.charting.models.LabReports;
import com.digitalhealthapp.charting.services.LabReportsService;

import java.sql.SQLException;
import java.util.List;

public class LabReportsServiceImpl implements LabReportsService {

    private LabReportsDao labReportsDao = new LabReportsDaoImpl();

    @Override
    public void insertLabReport(LabReports labReport) throws SQLException {
        labReportsDao.insertLabReport(labReport);
    }

    @Override
    public void insertLabReports(List<LabReports> reports) {

    }

    @Override
    public void getAllLabReports() {

    }

    @Override
    public LabReports getLabReportById(int reportId) {
        LabReports labReport = new LabReports();
        try {
            labReport = labReportsDao.getLabReportById(reportId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(labReport);

        return labReport;
    }
}
