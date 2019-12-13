package com.example.demo.bigtalkdesignpatterns.abstractfactorypatterns;

public class OracleUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在Oracle中插入一条user数据");
    }

    @Override
    public User getUser(Integer id) {
        System.out.println("在oracle中根据ID得到一条user数据");
        return null;
    }
}
