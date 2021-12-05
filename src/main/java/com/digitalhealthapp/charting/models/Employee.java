package com.digitalhealthapp.charting.models;

public class Employee {

    String doc_id, doc_totalPatients, doc_departmentId, doc_specializationDept, doc_description, doc_yrsOfExp;

    public String getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }

    public String getDoc_totalPatients() {
        return doc_totalPatients;
    }

    public void setDoc_totalPatients(String doc_totalPatients) {
        this.doc_totalPatients = doc_totalPatients;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "doc_id='" + doc_id + '\'' +
                ", doc_totalPatients='" + doc_totalPatients + '\'' +
                ", doc_departmentId='" + doc_departmentId + '\'' +
                ", doc_specializationDept='" + doc_specializationDept + '\'' +
                ", doc_description='" + doc_description + '\'' +
                ", doc_yrsOfExp='" + doc_yrsOfExp + '\'' +
                '}';
    }

    public String getDoc_departmentId() {
        return doc_departmentId;
    }

    public void setDoc_departmentId(String doc_departmentId) {
        this.doc_departmentId = doc_departmentId;
    }

    public String getDoc_specializationDept() {
        return doc_specializationDept;
    }

    public void setDoc_specializationDept(String doc_specializationDept) {
        this.doc_specializationDept = doc_specializationDept;
    }

    public String getDoc_description() {
        return doc_description;
    }

    public void setDoc_description(String doc_description) {
        this.doc_description = doc_description;
    }

    public String getDoc_yrsOfExp() {
        return doc_yrsOfExp;
    }

    public void setDoc_yrsOfExp(String doc_yrsOfExp) {
        this.doc_yrsOfExp = doc_yrsOfExp;
    }

}
