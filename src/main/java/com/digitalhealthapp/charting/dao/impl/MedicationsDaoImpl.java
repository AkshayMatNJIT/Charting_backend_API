package com.digitalhealthapp.charting.dao.impl;

import com.digitalhealthapp.charting.dao.MedicationsDao;
import com.digitalhealthapp.charting.models.Medications;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

public class MedicationsDaoImpl implements MedicationsDao {

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
    public void insertMedication(Medications medication) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("INSERT INTO medications " +
                "(patientId, doctorId, medicationName, medicationRoutine, tillDate, description, created_at, updated_at)" +
                " VALUES (?,?,?,?,STR_TO_DATE(?,'%Y-%m-%d %h:%i:%s'),?, now(), now())");
        ps.setInt(1, medication.getPatientId());
        ps.setInt(2, medication.getDoctorId());
        ps.setString(3, medication.getMedicationName());
        ps.setString(4, medication.getMedicationRoutine());
        ps.setString(5, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(medication.getTillDate()));
        ps.setString(6, medication.getDescription());
        ps.execute();
        System.out.println("Lab report added: " + medication);
    }

    @Override
    public void insertMedicationsList(List<Medications> medicationsList) {

    }

    @Override
    public List<Medications> getAllMedicationList() throws SQLException {
        return null;
    }

    @Override
    public Medications getMedicationById(int reportId) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM medications WHERE medicationId = ?");
        ps.setInt(1, reportId);
        ResultSet rs = ps.executeQuery();
        Medications med = new Medications();
        while (rs.next()) {
            med.setPatientId(rs.getInt(1));
            med.setDoctorId(rs.getInt(2));
            med.setMedicationId(rs.getInt(3));
            med.setMedicationName(rs.getString(4));
            med.setMedicationRoutine(rs.getString(5));
            med.setTillDate(rs.getTimestamp(6));
            med.setDescription(rs.getString(7));
        }
        return med;
    }
}
