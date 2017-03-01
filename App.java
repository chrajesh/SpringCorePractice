package com.rajpro.SpringCorePractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		System.out.println(obj);
		//obj.printHello();
		HelloWorld obj1 = (HelloWorld) context.getBean("helloBean");
		System.out.println(obj1);
		//obj.printHello();
	}
}
