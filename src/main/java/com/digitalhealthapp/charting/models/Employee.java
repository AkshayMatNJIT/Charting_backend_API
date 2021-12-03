package com.digitalhealthapp.charting.models;

public class Employee {

    String doc_id, doc_full_name, doc_email, doc_dept;

    public String getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }

    public String getDoc_full_name() {
        return doc_full_name;
    }

    public void setDoc_full_name(String doc_full_name) {
        this.doc_full_name = doc_full_name;
    }

    public String getDoc_email() {
        return doc_email;
    }

    public void setDoc_email(String doc_email) {
        this.doc_email = doc_email;
    }

    public String getDoc_dept() {
        return doc_dept;
    }

    public void setDoc_dept(String doc_dept) {
        this.doc_dept = doc_dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "doc_id='" + doc_id + '\'' +
                ", doc_full_name='" + doc_full_name + '\'' +
                ", doc_email='" + doc_email + '\'' +
                ", doc_dept='" + doc_dept + '\'' +
                '}';
    }


}
