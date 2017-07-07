package org.bhoopendra.learning.stream;

/**
 * Created by bhokumar on 7/7/2017.
 */
public class Employee {
    private String name;
    private int age;
    private Address address;

    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /*public boolean equals(Object obj){
        if(this==obj)
            return true;
        if (obj==null)
            return false;
        if (!(obj instanceof  Employee))
            return false;
        Employee employee = (Employee) obj;
        if(employee.name==null && name!=null)
            return false;
        if(!employee.name.equals(name))
            return false;
        if (employee.age!=age)
            return false;
        if (employee.address==null && address!=null)
            return false;
        if (!(employee.address.equals(address)))
            return false;
        return true;
    }

    public int hashCode(){
        int hash = 57;
        hash = hash+hash^age;
        hash = hash+ address.hashCode();
        hash = hash + name.hashCode();
        return hash;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return address != null ? address.equals(employee.address) : employee.address == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
