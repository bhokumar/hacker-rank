package org.bhoopendra.learning.enum1;

/**
 * Created by bhokumar on 7/11/2017.
 */
public enum Days implements Runnable {
    SUNDAY, MONDAY, TUESDAY;
    int i;

    public void run() {
        System.out.println(ContainingEnum.WEEK.A);
        System.out.println(ContainingEnum.WEEK.C);
        System.out.println(ContainingEnum.WEEK.B);
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(Days.MONDAY);
        CommonMethodClient.FIRST.commonMethod();
        CommonMethodClient.SECOND.commonMethod();
        CommonMethodClient.THIRD.commonMethod();
    }
}

class ContainingEnum {
    enum WEEK {
        A, B, C
    }
}

enum CommonMethodClient {
    FIRST {
        @Override
        public void commonMethod() {
            System.out.println("FIRST overriding common method");
        }
    }, SECOND {
        @Override
        public void commonMethod() {
            System.out.println("SECOND overriding common method");
        }
    }, THIRD {
        @Override
        public void commonMethod() {
            System.out.println("THIRD overriding common method");
        }
    };

    public void commonMethod() {
        System.out.println("common method");
    }
}