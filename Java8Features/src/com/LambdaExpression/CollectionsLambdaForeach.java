package com.LambdaExpression;


import java.util.Arrays;
import java.util.List;

public class CollectionsLambdaForeach {

	public static void main(String[] args) {
		List<String> l=Arrays.asList("waticoncity","delhi","dubaicity","aribicity");
		l.forEach(city->System.out.println("city  "+city));
		
		
		

	}

}
