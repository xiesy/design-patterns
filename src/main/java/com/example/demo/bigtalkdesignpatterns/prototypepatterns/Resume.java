package com.example.demo.bigtalkdesignpatterns.prototypepatterns;

public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;
    private WorkExperience workExperience;

    public Resume(String name){
        this.name = name;
        workExperience = new WorkExperience();
    }

    public void setPersonalInfo(String sex, String age){
        this.sex = sex;
        this.age = age;
    }

    public void  setWorkExperience(String workDate, String company){
        workExperience.setWorkDate(workDate);
        workExperience.setCompany(company);
    }

    public void display(){
        System.out.println("{}{}{}" + name + sex + age);
        System.out.println("工作经历：" + workExperience.getWorkDate() + workExperience.getCompany());
    }

    @Override
    public Resume clone() {
        Resume resume = null;
        try {
            resume = (Resume)super.clone();
            resume.workExperience = workExperience.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resume;
    }


}
