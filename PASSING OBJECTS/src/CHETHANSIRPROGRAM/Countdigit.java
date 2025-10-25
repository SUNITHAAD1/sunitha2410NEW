package CHETHANSIRPROGRAM;

import java.util.Scanner;

public class Countdigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	System.out.println();
	int n=sc.nextInt();
	int count = 0;
	while(n>0)
	{
		count++;
		n=n/10;
	}System.out.println("The count of given number is:"+count);
}
}
