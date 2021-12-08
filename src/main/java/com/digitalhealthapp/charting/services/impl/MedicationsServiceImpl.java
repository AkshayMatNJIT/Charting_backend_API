package com.digitalhealthapp.charting.services.impl;

import com.digitalhealthapp.charting.dao.MedicationsDao;
import com.digitalhealthapp.charting.dao.impl.MedicationsDaoImpl;
import com.digitalhealthapp.charting.models.Medications;
import com.digitalhealthapp.charting.services.MedicationsService;

import java.sql.SQLException;
import java.util.List;

public class MedicationsServiceImpl implements MedicationsService {

    private MedicationsDao medicationsDao = new MedicationsDaoImpl();

    @Override
    public void insertMedication(Medications medication) throws SQLException {
        medicationsDao.insertMedication(medication);
    }

    @Override
    public void insertMedications(List<Medications> medicationsList) {

    }

    @Override
    public List<Medications> getAllMedicationsList() throws SQLException {
        return medicationsDao.getAllMedicationList();
    }

    @Override
    public Medications getMedicationById(int medicationId) {

        Medications med = new Medications();
        try {
            med = medicationsDao.getMedicationById(medicationId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(med);

        return med;
    }
}
