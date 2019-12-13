package com.example.demo.bigtalkdesignpatterns.abstractfactorypatterns;

public class SqlServerFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlServerDepartment();
    }
}
