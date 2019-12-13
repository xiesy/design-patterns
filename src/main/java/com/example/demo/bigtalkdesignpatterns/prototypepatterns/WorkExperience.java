package com.example.demo.bigtalkdesignpatterns.prototypepatterns;

public class WorkExperience implements Cloneable{

    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public WorkExperience clone() {
        WorkExperience workExperience = null;
        try {
            workExperience = (WorkExperience)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return workExperience;
    }
}
