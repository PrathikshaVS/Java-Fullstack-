package Assign;

class Details
{
	String name;
	int age;
	Details(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void displayPerson()
	{
		System.out.printf("Name : %s \nAge: %d\n",this.name,this.age);
	}
	
}



public class Person {

	public static void main(String[] args) {
		Details p1=new Details ("Prathi",20);
		Details p2=new Details ("AlexRaj",22);
		p1.displayPerson();
		p2.displayPerson();

	}

}
