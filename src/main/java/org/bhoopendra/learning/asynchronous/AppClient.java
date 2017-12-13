package org.bhoopendra.learning.asynchronous;

import java.util.Arrays;
import java.util.List;

public class AppClient {

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       // final int sum = numbers.stream().parallel().mapToInt(AppClient::transform).sum();
        numbers.parallelStream().mapToInt(AppClient::transform).forEachOrdered(System.out::println);
        //System.out.println(sum);
    }

    public static int transform(final int number){
        System.out.println(Thread.currentThread()+"Number : "+number);
        return number;
    }
}
