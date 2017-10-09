package org.bhoopendra.learning.serialization;

import java.io.*;

public class SerializationClient5 {

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        try(FileOutputStream fileOutputStream = new FileOutputStream("file2");
            FileInputStream fileInputStream = new FileInputStream("file2")){

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(new E(1001,"employee","password123"));

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            E e = (E)objectInputStream.readObject();
            System.out.println("############################################");
            System.out.println(e);
        }
    }

}


class E implements Externalizable{
    private int id;
    private String name;
    private String password;

    public E() {
    }

    public E(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.write(id);
        out.writeObject(name+"original");
        out.writeObject(password+"password");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id=in.readInt();
        name=(String)in.readObject();
        password = (String) in.readObject();
        if (!name.endsWith("original")){
            throw  new RuntimeException("data corrupted");
        }
        if (!password.endsWith("password")){
            throw  new RuntimeException("data corrupted");
        }
    }

    @Override
    public String toString() {
        return "E{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}