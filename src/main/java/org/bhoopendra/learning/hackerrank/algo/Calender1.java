package org.bhoopendra.learning.hackerrank.algo;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Calender1 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        String month = in.next();
	        String day = in.next();
	        String year = in.next();
	        
	        Date date = new Date(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
	        LocalDate localDate = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
	        System.out.println(localDate.getDayOfWeek());
	        

	}
	

}
