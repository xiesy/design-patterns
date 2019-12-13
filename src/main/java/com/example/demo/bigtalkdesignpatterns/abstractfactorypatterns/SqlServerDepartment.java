package com.example.demo.bigtalkdesignpatterns.abstractfactorypatterns;

public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在SQL server给Department中插入一条数据");
    }

    @Override
    public Department getDepartment(Integer id) {
        System.out.println("在SQL server根据id得到Department");
        return null;
    }
}
