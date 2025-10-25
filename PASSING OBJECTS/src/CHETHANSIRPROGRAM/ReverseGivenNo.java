package CHETHANSIRPROGRAM;

import java.util.Scanner;

public class ReverseGivenNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();  		//649
		int num=n;
		int rev=0;
		int i=0;
		while(n>0)
		{
			int x=n%10;
			rev=(rev*10)+x;
			n=n/10;
		}i++;
		System.out.println("The reverse of given number is:"+rev);
		
		
	}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int reverse=0;
		int actual=n;
		/*while condition loop
		
		int i=0;
		while(n>0)
		{
			int rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
		}i++;
		
		   
		   /*
		     for loop  
		    
		for(int i=0;i<n;i++)
		{
			int rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
		}
		
		System.out.println("The reverse number is:"+reverse);
		if(actual==reverse)
		{
			System.out.println("The no. is not reversed");
				}		else {
				System.out.println("The reversed no. is"+reverse);
		}
	*/
