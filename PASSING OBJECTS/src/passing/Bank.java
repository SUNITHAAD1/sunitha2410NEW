package passing;

import java.util.Scanner;

public class Bank {
	
	static void displayAccountDetails(Account a)
	{
		if(a!=null)
		{
			System.out.println("Account number: "+a.anum);
			System.out.println("Account balance: "+a.abal);
		}
	}
	
	static Account createAccount()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Account Number");
		long anum=scn.nextLong();
		System.out.println("Enter Account Balance");
		double abal=scn.nextDouble();
		
		Account a=new Account(anum,abal);
		return a;
	}
	
	
	
	
	

}
