package com.example.demo.bigtalkdesignpatterns.abstractfactorypatterns;

public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在access中插入一条数据");
    }

    @Override
    public User getUser(Integer id) {
        System.out.println("在access中根据ID得到一条数据");
        return null;
    }
}
