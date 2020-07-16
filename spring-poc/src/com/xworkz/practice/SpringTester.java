package com.xworkz.practice;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTester {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			String metaInfo = "resources/spring.xml";
			context = new ClassPathXmlApplicationContext(metaInfo);
			String[] array = context.getBeanDefinitionNames();
			System.out.println(Arrays.toString(array));

			Farmer refFarmer1 = context.getBean("farmer1", Farmer.class);
			refFarmer1.sowing();

			Farmer refFarmer2 = context.getBean("farmer2", Farmer.class);
			refFarmer2.sowing();

			String email = context.getBean(String.class);
			System.out.println("Email : " + email.isEmpty());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (context != null) {
				ClassPathXmlApplicationContext clasPthXMl = (ClassPathXmlApplicationContext) context ;
				clasPthXMl.close();
			}
		}
	}
}
