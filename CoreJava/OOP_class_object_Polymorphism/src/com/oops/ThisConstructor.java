package com.oops;

public class ThisConstructor {
	String name;
	
	ThisConstructor(String name){
		this(10,20);
		this.name=name;
		this.greeting();
	}
	ThisConstructor(int a,int b){
		System.out.println("Sum :"+ (a+b));
	}
	void greeting() {
		System.out.println("Welcome : "+name);
	}

	public static void main(String[] args) {
		ThisConstructor obj =new ThisConstructor("Prathi");

	}

}
