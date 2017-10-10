package org.bhoopendra.learning.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class ReflectionClient {
    public static void main(String[] args) {
        Class aClass = InspectionObject.class;
        System.out.println(aClass.getName());
        System.out.println(aClass.getCanonicalName());
        System.out.println(aClass.getModifiers());

        System.out.println("################## Constructors ##########################");
        Constructor[] constructors = aClass.getConstructors();
        for (Constructor constructor : constructors){
            constructor.setAccessible(true);
            System.out.println(constructor.getName());
        }

        System.out.println("############ Methods #########################");
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods){
            System.out.print(method.getName()+"  ");
            System.out.println(method.getModifiers());

            System.out.println("#################### Method Parameters ##################");
            Parameter[] parameters = method.getParameters();
                Arrays.stream(parameters).forEach(System.out::println);
            System.out.println(Arrays.stream(parameters).count());
        }


    }
}
