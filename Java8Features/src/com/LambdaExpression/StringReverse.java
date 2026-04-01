package com.LambdaExpression;
interface StringFormat{
	String process (String s);
}
public class StringReverse {

	public static void main(String[] args) {
		StringFormat s=(st)->{ 
String str="";
//for(int i=0;i<st.length();i++) {
//	str=st.charAt(i)+str;

//}
for(char c:st.toCharArray()) str=c+str;

			return str;};
	System.out.println(	s.process("harsha"));
	StringFormat s1=(st)->{return st.toUpperCase();};
	System.out.println( s1.process("value"));
	StringFormat s2=(st)->{return st.toString();};
	System.out.println( s2.process("val2928"));
	
	}
	
	
}
