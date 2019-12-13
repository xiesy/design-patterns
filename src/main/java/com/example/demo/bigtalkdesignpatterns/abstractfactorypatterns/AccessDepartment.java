package com.example.demo.bigtalkdesignpatterns.abstractfactorypatterns;

public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在Access给Department中插入一条数据");
    }

    @Override
    public Department getDepartment(Integer id) {
        System.out.println("在Access根据id得到Department");
        return null;
    }
}
