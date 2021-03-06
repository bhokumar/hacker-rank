package org.bhoopendra.learning.design.pattern.singleton;

import org.bhoopendra.learning.serialization.SerializationUtils;

import java.io.IOException;
import java.io.Serializable;

public class SerializedSingleton implements Serializable{
    private static final long serialVersionUID = -7604766932017737115L;

    private final static SerializedSingleton serializedSingleton = new SerializedSingleton();
    private SerializedSingleton(){}


    public static SerializedSingleton getInstance(){
        return serializedSingleton;
    }

    protected Object readResolve(){
        return serializedSingleton;
    }
}

class Serialization{
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        SerializedSingleton serializedSingleton = SerializedSingleton.getInstance();
        SerializationUtils.serializeObject(serializedSingleton);
       Object o1 =  SerializationUtils.deSerializeObject();
       Object o2 =  SerializationUtils.deSerializeObject();
       if (serializedSingleton.equals(o1)){
           System.out.println("Both Objects are equal!");
       }
       if (o1.equals(o2)){
           System.out.println("Both Objects are equal!");
       }else {
           System.out.println("Object are not equal");
       }
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
    }

}