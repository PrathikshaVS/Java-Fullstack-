package com.Assign2;

class Animal1
{
	void makesound()
	{
		System.out.println("Animal makes sound");
	}
}
class Cat extends Animal1
{
	@Override
	void makesound()
	{
		System.out.println("Meow");
	}
}
public class Animal {

	public static void main(String[] args) {
		Cat c1=new Cat();
		c1.makesound();

	}

}