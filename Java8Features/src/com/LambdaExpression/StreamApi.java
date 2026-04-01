package com.LambdaExpression;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		//int[] arr= {20,30,40,50,60,80,33,75,98,947,87,98};
		List<Integer> i=Arrays.asList(20,30,40,50,60,80,33,75,98,947,87,90);
		i.stream().filter(a->a%2==0).map(a->a*a).forEach(a->System.out.println(a));
		System.out.println();
		i.stream().filter(a->a*2==100).map(a->a*a*a).forEach(System.out::println);
		
		List<String> li=Arrays.asList("python","java","react","javascript");
		String str=li.stream().filter(s->s.contains("j")).map(s->s.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(str);
		Map<Integer,String> map=new HashMap<>();

		map.put(1, "india");
		map.put(2, "bangadesh");
		map.put(3, "sri lanka");
		map.put(4, "tibet");
		//map.forEach((key,value)-> System.out.println(key+" "+value));
	map.forEach((k,v)->System.out.println(k+" "+v));
	
	}

}
