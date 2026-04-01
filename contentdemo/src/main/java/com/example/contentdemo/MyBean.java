package com.example.contentdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyBean {
	int n;
	@Value("${package.name}")
    private String name;
    public void pack() {
    	System.out.println(name);
    }
    public void sayHello() {
        System.out.println("Hello from MyBean!");
    }
    public void num(int num) {
    this.n=num;
    System.out.println(n);
    }
    public int number() {
    	return n;
    }
    
    
}