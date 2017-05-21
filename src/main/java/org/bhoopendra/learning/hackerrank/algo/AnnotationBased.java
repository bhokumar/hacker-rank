package org.bhoopendra.learning.hackerrank.algo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class AnnotationBased {

	public static void main(String[] args) {

	}
	
	@StringAppender(appenDString="CustomString")
	public void show() {
		
	}

}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface StringAppender {
	String appenDString() default "String";
}
