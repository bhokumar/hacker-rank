package org.bhoopendra.learning.enum1;

/**
 * Created by bhokumar on 7/12/2017.
 */
enum Enums
{
    A, B, C;

    {
        System.out.println(1);
    }

    static
    {
        System.out.println(2);
    }

    private Enums()
    {
        System.out.println(3);
    }
}

class MainClass
{
    public static void main(String[] args)
    {
        Enum en = Enums.C;
    }
}