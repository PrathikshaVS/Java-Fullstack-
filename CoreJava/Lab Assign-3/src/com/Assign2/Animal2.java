package com.Assign2;

class AnimalMoves
{
	void move()
	{}
}
class Cheetah extends AnimalMoves
{
	@Override
	void move()
	{
		System.out.println("cheetah is running");
	}
}


public class Animal2 {

	public static void main(String[] args) {
		Cheetah c1= new Cheetah();
		c1.move();
	}

}