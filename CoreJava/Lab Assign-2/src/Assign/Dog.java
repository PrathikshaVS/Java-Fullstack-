package Assign;

class Dog1
{
	String name;
	String breed;
	Dog1(String name,String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	void setter(String name,String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	
	void getter()
	{
		System.out.printf("Name : %s \nbreed: %s\n",this.name,this.breed);
	}
	
}


public class Dog {

	public static void main(String[] args) {
		Dog1 d1=new Dog1("Alex","breed1");
		Dog1 d2=new Dog1("Johnathan","breed2");
		d1.getter();
		d2.getter();
		d1.setter("Berry", "breed3");
		d1.getter();
	}

}
