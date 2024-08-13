package com.Assign2;


class Shape1
{
	void getArea()
	{
		System.out.println("Area of Shapes");
	}
}
class Rectangle extends Shape1
{
	double height;
	double width;
	Rectangle(double h,double w)
	{
		this.height=h;
		this.width=w;
	}
	@Override
	void getArea()
	{
		System.out.println("Area of rectangle : "+(this.height*this.width));
	}
}

public class Shape {

	public static void main(String[] args) {
			Rectangle r1= new Rectangle(10,10);
			r1.getArea();
	}

}
