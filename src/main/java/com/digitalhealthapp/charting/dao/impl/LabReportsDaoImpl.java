package com.digitalhealthapp.charting.dao.impl;

import com.digitalhealthapp.charting.dao.LabReportsDao;
import com.digitalhealthapp.charting.models.Employee;
import com.digitalhealthapp.charting.models.LabReports;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
        PreparedStatement ps = connection.prepareStatement("INSERT INTO lab_reports " +
                "(patientId, doctorId, reportName, worksheetFilepath, patientFilepath, dueBy, description, created_at, updated_at)" +
                " VALUES (?,?,?,?,?,STR_TO_DATE(?,'%Y-%m-%d %h:%i:%s'),?, now(), now())");
        ps.setInt(1, lab_report.getPatientId());
        ps.setInt(2, lab_report.getDoctorId());
        ps.setString(3, lab_report.getReportName());
        ps.setString(4, lab_report.getWorksheetFilepath());
        ps.setString(5, lab_report.getPatientFilepath());
        ps.setString(6, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(lab_report.getDueBy()));
        ps.setString(7, lab_report.getDescription());
        ps.execute();
        System.out.println("Lab report added: " + lab_report);
    }

    @Override
    public void insertLabReports(List<LabReports> lab_reports) {

    }

    @Override
    public List<LabReports> getAllLabReports() throws SQLException {
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM lab_reports");
        ResultSet rs = ps.executeQuery();
        List<LabReports> lr_list = new ArrayList<LabReports>();

        while (rs.next()) {
            LabReports lr = new LabReports();
            lr.setPatientId(rs.getInt(1));
            lr.setDoctorId(rs.getInt(2));
            lr.setReportId(rs.getInt(3));
            lr.setReportName(rs.getString(4));
            lr.setWorksheetFilepath(rs.getString(5));
            lr.setPatientFilepath(rs.getString(6));
            lr.setDueBy(rs.getTimestamp(7));
            lr.setDescription(rs.getString(8));
            lr_list.add(lr);
        }
        return lr_list;
    }

    @Override
    public LabReports getLabReportById(int reportId) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM lab_reports WHERE reportId = ?");
        ps.setInt(1, reportId);
        ResultSet rs = ps.executeQuery();
        LabReports lr = new LabReports();
        while (rs.next()) {
            lr.setPatientId(rs.getInt(1));
            lr.setDoctorId(rs.getInt(2));
            lr.setReportId(rs.getInt(3));
            lr.setReportName(rs.getString(4));
            lr.setWorksheetFilepath(rs.getString(5));
            lr.setPatientFilepath(rs.getString(6));
            lr.setDueBy(rs.getTimestamp(7));
            lr.setDescription(rs.getString(8));
        }
        return lr;
    }
}
