package com.example.contentdemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Singleton {
	private String name;
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {return name;}

}
