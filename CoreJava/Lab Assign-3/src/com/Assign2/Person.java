package com.Assign2;

class Person1
{
	
	void getFirstName()
	{
	}
	void getLastName()
	{
	}
}

class EmployeeDetail extends Person1
{
	String fname1;
	int id;
	String title;
	

	void getEmployeeId(String name,int id,String title)
	{
		this.fname1=name;
		this.id=id;
		this.title=title;
		System.out.println("ID : "+this.id);
	}
	@Override
	void getLastName()
	{
		System.out.println("Last name : "+this.fname1);
		System.out.println("Job title: "+this.title);
	}
	
}


public class Person {

	public static void main(String[] args) {
		EmployeeDetail e1=new EmployeeDetail();
			e1.getEmployeeId("Ron",101,"CEO");
			e1.getLastName();
	}

}