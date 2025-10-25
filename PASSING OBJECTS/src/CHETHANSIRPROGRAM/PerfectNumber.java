package CHETHANSIRPROGRAM;

import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
	//wap to find perfect number or not    assume 6, it is divisilbe by 1,2,3.
	//The sum of divisible equals to the number. 1+2+3=6
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int num=n;
	int perfect=0;
	
	for(int i=1;i<=n/2;i++) {
		if((n%i)==0) {
		perfect=perfect+i;
	
	
		}
	}
	System.out.println("The sum of factors is:"+perfect);
	if(num==perfect) {
		System.out.println("It is perfect no.");} 	else System.out.println("It is not perfect no.");	
}
}
