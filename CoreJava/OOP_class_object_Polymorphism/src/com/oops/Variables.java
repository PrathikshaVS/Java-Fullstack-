package com.oops;

public class Variables {
	int b=20;
	static int c=30;
	 public static void main(String[] args) {
		 int s=10;
		 System.out.println("Local Variable :" + s);
		 Variables obj=new Variables();
		 System.out.println(obj.b);
		 System.out.println(Variables.c);
	 }

}
