package com.anudip.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

//		Demo demo1= new Demo();
//		demo1.code();
//		Demo obj1 = context.getBean(Demo.class);
//		obj1.code();
		User obj = context.getBean(User.class);
		System.out.println(obj.getAge());
		obj.code();

	}

}
