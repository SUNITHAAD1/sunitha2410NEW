package CHETHANSIRPROGRAM;

import java.util.Scanner;

public class SpyNo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	
	int n=sc.nextInt();
	int sum=0;
	int prod=1;
	
	while(n>0)
	{
		int mod=n%10;
		sum=sum+mod;
		prod=prod*mod;
		n=n/10;
		
	}
	System.out.println("The sum is:"+sum);
	System.out.println("The product is:"+prod);
	System.out.println("-----------------");
	
	if(sum==prod) 
	{	System.out.println(sum+"="+prod+":Both number are same so it is SPY number");} 
	else {System.out.println("Not spy number");}
	
}
}
