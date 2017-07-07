package org.bhoopendra.learning.oops;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bhokumar on 7/6/2017.
 */
public class TestClient {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
    }
}

interface  A{
    void show();
}

interface  B{
    void display();
}

interface C extends A,B{
    void iterate();
}

class D implements C{

    @Override
    public void show() {

    }

    @Override
    public void display() {

    }

    @Override
    public void iterate() {

    }
}