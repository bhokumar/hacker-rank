package org.bhoopendra.learning.enum1;

/**
 * Created by bhokumar on 7/12/2017.
 */
enum MyEnums
{
    FIRST, SECOND, THIRD, FOURTH;
}

class TestEnums
{
    public static void main(String[] args)
    {
        MyEnums[] myEnums = MyEnums.values();

        for (int i = 0; i < myEnums.length; i++)
        {
            System.out.println(myEnums[i]);
        }
    }
}