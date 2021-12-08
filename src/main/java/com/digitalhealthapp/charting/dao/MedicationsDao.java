package com.digitalhealthapp.charting.dao;

import com.digitalhealthapp.charting.models.Medications;

import java.sql.SQLException;
import java.util.List;

public interface MedicationsDao {

    void insertMedication(Medications medication) throws SQLException;
    void insertMedicationsList(List<Medications> medicationsList);
    List<Medications> getAllMedicationList() throws SQLException;
    Medications getMedicationById(int reportId) throws SQLException;
}
