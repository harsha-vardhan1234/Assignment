package com.LambdaExpression;

import java.util.function.BiFunction;
import java.util.function.Predicate;

interface Sum{
	int sum(int a,int b);
}
public class Addtion {

	public static void main(String[] args) {
		Sum s=(a,b)->{return a+b;};
		int res=s.sum(10,20);
		System.out.println(res);
		Sum s1=(a,b)-> { if(a>b)return a; else return b;};
		System.out.println(s1.sum(80, 30));
		
		BiFunction<Integer, Integer, Integer> bi=(a,b)-> {return a+b;};
		BiFunction<Integer, Integer, Integer> large=(a,b)->(a>b)?a:b;
		System.out.println(bi.apply(10, 20));
		System.out.println(large.apply(30, 60));
		Predicate<Integer> i=(a)->{if(a%2==0 && a>10) return true; else return false;};
		System.out.println(i.test(13));
		

	}

}
