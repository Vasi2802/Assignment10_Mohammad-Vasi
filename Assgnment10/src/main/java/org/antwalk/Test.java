package org.antwalk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		CustomerService cs=(CustomerService)context.getBean("customerServiceProxy1");
		System.out.println("------------");
		cs.getUrl();
		System.out.println("------------");
		cs.getName();
		System.out.println("------------");
		Student s1=(Student) context.getBean("studentproxy1");
		System.out.println("------------");
		s1.avgMark();
		System.out.println("------------");
		s1.showResult();
		System.out.println("------------");
		
	}

}
