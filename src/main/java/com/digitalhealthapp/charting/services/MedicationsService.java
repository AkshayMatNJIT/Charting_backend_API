package com.digitalhealthapp.charting.services;

import com.digitalhealthapp.charting.models.Medications;

import java.sql.SQLException;
import java.util.List;

public interface MedicationsService {

    void insertMedication(Medications medication) throws SQLException;
    void insertMedications(List<Medications> medicationsList);
    void getAllMedicationsList();
    Medications getMedicationById(int medicationId);
}
