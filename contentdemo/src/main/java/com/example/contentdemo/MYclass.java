package com.example.contentdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
@ComponentScan("com.example.contentdemo")
@PropertySource("classpath:application.properties")
public class MYclass {
//	@Value("${package.name}")
//	private  String packageName;

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MYclass.class);
	MyBean mybean=context.getBean(MyBean.class);
	mybean.sayHello();
	MyBean my=context.getBean(MyBean.class);
	my.sayHello();
	MyBean b=new MyBean();
	MyBean b1=new MyBean();
	System.out.println(my==mybean);//return the single object which will save the memory in the RAM if u need to have the new object everytime use the @scope("prototype") to the bean class  
	System.out.println(b==b1);//create the different objects for the using of the new keyword of same class but we can't No Injection,No Autowiring,Isolation
	my.pack();
	mybean.num(10);
	my.num(20);
	System.out.println(my.number()+" "+mybean.number());
	

   }

}
