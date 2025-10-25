package CHETHANSIRPROGRAM;

import java.util.Scanner;

public class SumofAllDigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	System.out.println("...........................");
	
	int n=sc.nextInt();
	int sum=0;
	while(n>0)
	{
		int rem=n%10;
		sum=sum+rem;
		n=n/10;
	}System.out.println("The sum of all digit is :"+sum);
}
}
