package com.example.demo.bigtalkdesignpatterns.abstractfactorypatterns;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DataAccess {

    private static String assemblyName = "com.example.demo.bigtalkdesignpatterns.abstractfactorypatterns";

    public static IUser createUser() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String className = assemblyName + "." + "SqlserverUser";
        Class clz = Class.forName(className);
        Constructor constructor = clz.getConstructor();
        Object o = constructor.newInstance();
        return (IUser) o;
    }

    public static IDepartment createDepartment() throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        String className = assemblyName + "." + "AccessDepartment";
        Class clz = Class.forName(className);
        Constructor constructor = clz.getConstructor();
        Object o = constructor.newInstance();
        return (IDepartment) o;
    }

}
