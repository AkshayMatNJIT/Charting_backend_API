package com.digitalhealthapp.charting.models;

public class Employee {

    String doc_id, doc_description;
    int doc_totalPatients, doc_departmentId, doc_yrsOfExp;

    public String getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }

    public int getDoc_totalPatients() {
        return doc_totalPatients;
    }

    public void setDoc_totalPatients(int doc_totalPatients) {
        this.doc_totalPatients = doc_totalPatients;
    }

    public int getDoc_departmentId() {
        return doc_departmentId;
    }

    public void setDoc_departmentId(int doc_departmentId) {
        this.doc_departmentId = doc_departmentId;
    }

    public int getDoc_yrsOfExp() {
        return doc_yrsOfExp;
    }

    public void setDoc_yrsOfExp(int doc_yrsOfExp) {
        this.doc_yrsOfExp = doc_yrsOfExp;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "doc_id='" + doc_id + '\'' +
                ", doc_totalPatients='" + doc_totalPatients + '\'' +
                ", doc_departmentId='" + doc_departmentId + '\'' +
                ", doc_description='" + doc_description + '\'' +
                ", doc_yrsOfExp='" + doc_yrsOfExp + '\'' +
                '}';
    }

    public String getDoc_description() {
        return doc_description;
    }

    public void setDoc_description(String doc_description) {
        this.doc_description = doc_description;
    }

}
