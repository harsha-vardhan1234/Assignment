package com.example.contentdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PrototypeSingleton {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(PrototypeSingleton.class,args);
		Singleton single=context.getBean(Singleton.class);
		single.setname("welcome");
		Singleton single1=context.getBean(Singleton.class);
		System.out.println(single1.getname()+" "+(single==single1));
		Prototype p=context.getBean(Prototype.class);
		p.setname("prototype");
		Prototype p1=context.getBean(Prototype.class);
		System.out.println(p1.getname()+" "+(p1==p));
		
		}

}
