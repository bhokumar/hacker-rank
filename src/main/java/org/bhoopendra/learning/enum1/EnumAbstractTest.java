package org.bhoopendra.learning.enum1;

/**
 * Created by bhokumar on 7/11/2017.
 */
public enum EnumAbstractTest {
    FIRST {
        int i=100;
        void test(){
            System.out.println(i);
            System.out.println("test method");
        }
        void calculateTest() {
            test();
            System.out.println("first");
        }
    },SECOND {
        @Override
        void calculateTest() {

        }
    },THIRD {
        @Override
        void calculateTest() {

        }
    };
    abstract void calculateTest();
}

class Client{
    public static void main(String[] args) {
        EnumAbstractTest.FIRST.calculateTest();
    }
}