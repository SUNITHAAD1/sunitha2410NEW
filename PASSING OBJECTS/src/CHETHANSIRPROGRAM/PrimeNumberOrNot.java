package CHETHANSIRPROGRAM;

import java.util.Scanner;

public class PrimeNumberOrNot {
public static void main(String[] args) {
	//prime no.which is divisible  1 and itself.
	
	int n=3;
	int count=0;
	
	for(int i=1;i<=n/2;i++)
	{
		if((n%i)==0)
		{			count++;			}
	}
	if(count==1)
	{System.out.println(n+" is Prime number");}
	else
	{System.out.println(n+" it is not Prime number");}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();  		
	int count=0;
	
	
	
	
	for(int i=1; i<=n/2;i++)
	{	 if((n%i)==0)
			{count++;}	
	}
	
	
	if(count==1)
	{		System.out.println("The number is prime");} else {System.out.println("The number is not prime");}
		*/
}
}
