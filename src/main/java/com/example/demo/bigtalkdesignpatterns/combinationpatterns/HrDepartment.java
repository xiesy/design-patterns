package com.example.demo.bigtalkdesignpatterns.combinationpatterns;

public class HrDepartment extends Company {

    public HrDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        System.out.println(depth + name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + "员工招聘管理训练222");
    }
}
