package com.oops;

public class ConstructorOverloading {
	ConstructorOverloading(String name) {
		System.out.println("Welcome :"+name);
	}
    ConstructorOverloading(int a,int b) {
    	this("Prathi");
		System.out.println("Addition :"+(a+b));
	}
    ConstructorOverloading(int n) {
    	this(10,20);
		int fact=1;
		for (int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial:"+fact);
	}

	public static void main(String[] args) {
		ConstructorOverloading obj = new ConstructorOverloading(5);
		
	}

}
