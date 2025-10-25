package CHETHANSIRPROGRAM;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		
		int sq=n*n;
		System.out.println("The square is:"+sq);
		while(sq>0)
		{
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
			
		}
		if(n==sum)
		{
			System.out.println("Number is Neon");
		}else {System.out.println("Number is not neon");}
		
	}

}
