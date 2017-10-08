package org.bhoopendra.learning.clone;

public class CloneOperation {

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneObject cloneObject = new CloneObject();
        cloneObject.clone();
    }

}

class CloneObject implements Cloneable{
    @Override
    public Object clone() throws CloneNotSupportedException{
    return super.clone();
    }
}
