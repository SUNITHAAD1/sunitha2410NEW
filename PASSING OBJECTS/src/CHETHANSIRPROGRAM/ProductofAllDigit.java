package CHETHANSIRPROGRAM;

import java.util.Scanner;

public class ProductofAllDigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	
	int n=sc.nextInt();
	int prod=1;
	
	while(n>0)
	{
		int mod=n%10;
		prod=prod*mod;
		n=n/10;
		
	}System.out.println("The product of all the digit is:"+prod);
	
}
}
