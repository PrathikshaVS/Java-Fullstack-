package com.Assign2;

class Employee
{
	void work()
	{
		
	}
	void getSalary()
	{
		
	}
}

class HRManager extends Employee
{
	@Override
	void work()
	{
		System.out.println("working");
	}
	void addEmployee()
	{
		System.out.println("Added employee");
	}
}


public class Employee1 {
	public static void main(String args[])
	{
		HRManager h1=new HRManager();
		h1.addEmployee();
		h1.work();
	}
}