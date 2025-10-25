package passing;

import java.util.Scanner;

public class BiryaniHelper {

	static void displayBiryaniProperties(Biryani b)
	{if(b!=null) {
		System.out.println("Quanity: "+b.qty);
		System.out.println("Price: "+b.price);
		
	}
}
	static Biryani createBiryani()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Quanity");
		int qty=scn.nextInt();
		System.out.println("Enter Price");
		double price=scn.nextDouble();
		Biryani b=new Biryani(qty,price);
		return b;
		
	}
}
