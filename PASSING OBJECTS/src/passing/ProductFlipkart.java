package passing;

import java.util.Scanner;

public class ProductFlipkart {
	static void showproductinfo(Product p)
	{
		if(p!=null)
		{
			System.out.println("Product ID: "+p.pid);
			System.out.println("Product Price :"+p.price;);
		}
			
	}
	static Product createproduct()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Product id");
		int pid=scn.nextInt();
		System.out.println("Enter Product price");
		double price=scn.nextDouble();
		
		Product p = new Product(pid,price);
		return p;
		
		
	}

}
