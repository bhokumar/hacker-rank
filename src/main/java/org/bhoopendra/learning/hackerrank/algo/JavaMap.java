package org.bhoopendra.learning.hackerrank.algo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
	public static void main(String []argh)
	   {
	       Map<String,Integer> phoneBook = new HashMap<>();
	      Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         in.nextLine();
	          phoneBook.put(name,phone);
	      }
	         int q=in.nextInt();
	       for(int i=0;i<q;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         Integer ph = phoneBook.get(name);
	           if(ph==null){
	               System.out.println("Not found");
	           }else{
	               System.out.println(name+"="+ph);
	           }
	      }
	      
	      
	   }
}
