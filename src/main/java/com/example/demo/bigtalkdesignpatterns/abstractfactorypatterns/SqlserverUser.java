package com.example.demo.bigtalkdesignpatterns.abstractfactorypatterns;

public class SqlserverUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在SQL server中插入一条数据");
    }

    @Override
    public User getUser(Integer id) {
        System.out.println("在sql server中根据ID得到一条数据");
        return null;
    }
}
