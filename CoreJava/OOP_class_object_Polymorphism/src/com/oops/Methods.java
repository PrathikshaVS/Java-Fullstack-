package com.oops;

public class Methods {
	void myMethod1() {
		System.out.println("Instance of Object Method");
		
	}
    static void myMethod2() {
    	System.out.println("Static or Class Method");
		
    }
	public static void main(String[] args) {
		Methods obj =new Methods();
		obj.myMethod1();
		 Methods.myMethod2();

	}

}
