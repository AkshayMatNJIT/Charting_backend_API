package com.digitalhealthapp.charting.models;

import java.sql.Timestamp;
import java.util.Date;

public class Medications {

    int patientId, doctorId, medicationId;
    String medicationName, medicationRoutine, description;
    Timestamp tillDate = new Timestamp(new Date().getTime());

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

    public int getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(int medicationId) {
        this.medicationId = medicationId;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getMedicationRoutine() {
        return medicationRoutine;
    }

    public void setMedicationRoutine(String medicationRoutine) {
        this.medicationRoutine = medicationRoutine;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getTillDate() {
        return tillDate;
    }

    public void setTillDate(Timestamp tillDate) {
        this.tillDate = tillDate;
    }
}
