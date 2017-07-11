package org.bhoopendra.learning.enum1;

/**
 * Created by bhokumar on 7/11/2017.
 */
public enum EnumAbstractTest {
    FIRST(1) {
        int i=100;
        void test(){
            System.out.println(i);
            System.out.println("test method");
        }
        void calculateTest() {
            test();
            System.out.println("first");
        }
    },SECOND(2) {
        @Override
        void calculateTest() {
            System.out.println();
        }
    },THIRD(4) {
        @Override
        void calculateTest() {

        }
    };

    private EnumAbstractTest(final int i) {
        System.out.println(i);
    }

    abstract void calculateTest();
}

class Client{
    public static void main(String[] args) {
        EnumAbstractTest.FIRST.calculateTest();
    }
}