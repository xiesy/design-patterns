package com.example.demo.bigtalkdesignpatterns.abstractfactorypatterns;

import java.lang.reflect.InvocationTargetException;

public class AbstractFactoryTest {

    public static void main(String[] args){
        User user = new User();

        Department department = new Department();
        IUser iu = null;

        IDepartment iDepartment = null;
        try {
            iu = DataAccess.createUser();
            iDepartment = DataAccess.createDepartment();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        iu.insert(user);
        iu.getUser(1);

        iDepartment.insert(department);
        iDepartment.getDepartment(1);



    }

}
