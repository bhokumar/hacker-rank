package org.bhoopendra.learning.generics;

/**
 * Created by BHOOPENDRA on 7/15/2017.
 */

public class GenericTest implements GenericInterface<Integer> {
   public Integer test(){
       System.out.println("Returning Integer");
       return 100;
   }
}

interface GenericInterface<Integer>{
    Integer test();

}