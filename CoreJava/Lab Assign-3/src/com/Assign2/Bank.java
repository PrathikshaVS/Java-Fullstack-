package com.Assign2;


class BankAccount
{
	void deposit()
	{
		
	}
	void withdraw()
	{
		
	}
}

class SavingsAccount extends BankAccount
{
	
	@Override
	void withdraw()
	{
		System.out.println("Account balance less than hundred");
	}
	
}


public class Bank {

	public static void main(String[] args) {

		SavingsAccount s1 = new SavingsAccount();
		int withdrawAmount=80;
	
		if(withdrawAmount<100)
		{
			s1.withdraw();
		}
		
		
	}

}