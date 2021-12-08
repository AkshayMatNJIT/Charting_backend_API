package com.digitalhealthapp.charting.dao.impl;

import com.digitalhealthapp.charting.dao.LabReportsDao;
import com.digitalhealthapp.charting.models.LabReports;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class LabReportsDaoImpl implements LabReportsDao {

    Connection connection;

    {
        try {
            connection = JDBCConnector.getInstance().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insertLabReport(LabReports lab_report) throws SQLException {

    }

    @Override
    public void insertLabReports(List<LabReports> lab_reports) {

    }

    @Override
    public List<LabReports> getAllLabReports() throws SQLException {
        return null;
    }

    @Override
    public LabReports getLabReportById(int reportId) throws SQLException {
        return null;
    }
}
