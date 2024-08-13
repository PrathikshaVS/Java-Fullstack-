package com.Assign2;

class Vehicle
{
	void drive()
	{
		
	}
}

class Car extends Vehicle
{
	@Override
	void drive()
	{
		System.out.println("Repare a Car");
	}
}
public class Vehicle1 {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.drive();

	}

}
