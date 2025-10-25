package CHETHANSIRPROGRAM;

import java.nio.file.attribute.AclEntry;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayPrograms {
public static void main(String[] args) {

/*
	System.out.println("1. WAP TO PRINT NUMBER OF ELEMENTS IN THE GIVEN ARRAY ");
	int[] a1= {10,20,30,40,50};
	for(int i=0;i<a1.length;i++)
	{		System.out.println("Index value  "+i +"= "+a1[i]);
	}System.out.println("Length of the given array is:"+a1.length);
	System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
	
	System.out.println("2. WAP TO FIND THE SUM OF ALL THE ELEMENTS PRESENT IN AN ARRAY");
	int[] a2= {10,20,30,40,50};  // sum is=150
	int sum =0;
	for(int i=0;i<a2.length;i++)
	{sum=sum+a2[i];				} System.out.println("Sum of the given array is:"+sum);
	System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
	
	System.out.println("3. WAP TO SUM OF ALL THE EVEN ELEMENTS PRESENT IN AN ARRAY ");
	int[] a3= {10,25,15,20,30,45,35,40,50};  
	int sumev =0;
	for(int i=0;i<a3.length;i++)
	{	if(a3[i]%2==0)
		sumev=sumev+a3[i];
	}System.out.println("Sum f Even no. in an array is :"+sum);
	System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
	
	System.out.println("4. WAP TO SUM OF ALL THE ODD & EVEN ELEMENTS PRESENT IN AN ARRAY ");
	int[] a4= {10,25,15,20,30,45,35,40,50};  
	int sumeve =0, sumodd=0;
	for(int i=0;i<a4.length;i++)
	{	if(a4[i]%2==0)
			{sumeve=sumeve+a4[i];}
			else if (a4[i]%2!=0) 
				{sumodd=sumodd+a4[i];}
	}System.out.println("Sum of Even no. in an array is :"+sumeve);
	System.out.println("Sum of Odd no. in an array is :"+sumodd);
	System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
	
	System.out.println("5.111. WAP TO COUNT OF ALL THE ODD & EVEN ELEMENTS PRESENT IN AN ARRAY ");
	int[] a5= {1,2,3,4,5,6,7,8,9,10,11};
	int countodd=0, counteven=0;
	int sumodd5=0, sumeven5=0;
	for(int i=0;i<a5.length;i++)
	{
		if(a5[i]%2==0)
		{	counteven++; 		sumeven5=sumeven5+a5[i]; 	}
		else if (a5[i]%2!=0)
		{	countodd++;			sumodd5=sumodd5+a5[i];		}
	}		System.out.println("count of Even no. in an array :"+counteven);
			System.out.println("count of Odd no. in an array :"+countodd);
			System.out.println("sum of Even no in an array :"+sumeven5);
			System.out.println("sum of Odd no in an array :"+sumodd5);
	System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
	
	System.out.println("5. WAP TO SWAP THE GIVEN NUMBER ");
	int x=10;
	int y=20;
	int temp;
	temp=x;
	x=y;
	y=temp;
	System.out.println("The value of X is: "+x);
	System.out.println("The value of y is: "+y);
	System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
	
	System.out.println("5.111 WAP TO SWAP THE GIVEN ARRAY ");
	int[] b= {80,90,12};
	for(int i=0;i<b.length;i++) {
	for(int j=i+1;j<=b.length-1;j++) {
		int tempc=b[i];
		b[i]=b[j];  
		b[j]=tempc;  System.out.println(b[i]+","+b[j]);
	}}System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
	
	System.out.println("6. WAP TO REVERSE THE GIVEN ARRAY ");
	int[] a6= {1,2,3,4,5,6,7,8,9,10,11};
	for(int i=a6.length-1;i>=0;i--)
	{		System.out.print(a6[i]+",");			}System.out.println();
	System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
	
	
	System.out.println("8. WAP TO REVERSE THE FIRST HALF OF AN ARRAY ");
	int [] a8= {10,20,30,40,50};
			for(int i=(a8.length/2);i>=0;i--)
			{	System.out.print(a8[i]+" ");	} 		System.out.println();
	
	System.out.println("9. WAP TO REVERSE THE SECONF HALF OF AN ARRAY ");
	int [] a9= {10,20,30,40,50,60};
		for(int i=(a9.length-1);i>=(a9.length/2);i--)
		{		System.out.print(a9[i]+" ");   }   System.out.println();
	
	
	System.out.println("10. WAP TO FIND LARGEST NUMBER IN AN ARRATY ");
	int []a= {10,50,30,70,90,5};
	int large=a[0];
	for(int i=1;i<a.length;i++)
	{
		 large=a[i];
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}System.out.println("The largest element in the array is: "+large);
	
	
	System.out.println("11. WAP TO FIND SMALLEST NUMBER IN AN ARRAY");
	int []a= {10,50,30,70,90,5};
	int small=a[0];
	for(int i=1;i<a.length;i++)
	{
		 small=a[i];
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}System.out.println("The smallest element in the array is: "+small);
	
	System.out.println("12. WAP TO TO MERGE TWO ARRAY ");
	int []a={10,50,30};
	int []b= {70,80,90,100};
	int []c= new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
		c[i]=a[i];
		}
		for(int j=0;j<b.length;j++)
		{
		c[a.length+j]=b[j];
		}
		for(int k=0;k<c.length;k++)
		{
		System.out.println("The merged array is:"+c[k]);	
		}
	
	
	
	System.out.println("13. WAP TO MOVE ALL THE ZEROS AT THE END OF AN ARRAY");
	int[] a= {10,0,20,0,30,0,40,0,50,0};
	int count=0;
	for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{		
			a[count]=a[i];
			count++;
			}
		}
	while(count<a.length)
	{
		a[count]=0;
		count++;
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
	}
	
	System.out.println("14. WAP TO MOVE ALL THE ZEROS IN THE BEGINNING OF AN ARRAY ");
	int [] a= {10,0,20,0,30,0,40,0};
	int count=a.length-1;
	for(int i=a.length-1;i>=0;i--)
		{	if(a[i]!=0)
				{		
				a[count]=a[i];
				count--;
				}
		}
	while(count>=0)
	{
		a[count]=0;
		count--;
	}
	for(int i=0;i<a.length;i++)
	{	System.out.println(a[i]+"  ");		}
	
	
	
	System.out.println("15. WAP to check if the given element present array or not (linear search) ");
	
	int[] a= {10,34,56,23,67,89};
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int key=n;
	
	for(int i=0;i<a.length;i++)
	{
		if(key==a[i])
		{		System.out.println(a[i]+" :is present in the array");
				System.out.println(i);
						System.out.println(":element in the array");
		}
		else
		{		System.out.println("The element not found in an array");}
	}
	
	
	
	System.out.println("WRITE A PROGRAM TO  FIND A ELEMENT PRESENT IN AN ARRAY AND COUNT NUMBER OF TIMES");
	
	int []a= {40,10,20,40,30,40,50,40};
	int key=40;
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(key==a[i])
		{
			count++;
		}
	}System.out.println("Element is present in an array "+count+" times it is present");

	*/
	System.out.println("WAP TO SORT AN ARRAY USING BUBBLE SORT");
	int []a= {10,5,90,45,30,80,70,5};
	
	for(int k=0;k<a.length;k++)
	{
		System.out.print(a[k]+" ");
	}
	System.out.println();
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{	if(a[i]>a[j])
			{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
	}
	System.out.println("After Sorting    :");
	for(int k=0;k<a.length;k++)
	{
		System.out.print(a[k]+" ");
	}
	
	
	
	
	
	

}
}

