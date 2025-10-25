package CHETHANSIRPROGRAM;

public class PatternsAlphabetsSpecificationChethan {
	public static void main(String[] args) {
		System.out.println("WAP TO PRINT ONLY 'A' IN 4 COLUMN ");
	char ch='A';
	int num=01;
	int n=4;
	for(int i=1;i<=n;i++)
	{	for(int j=1;j<=n;j++)
		{	System.out.print(ch+" ");	
		}System.out.println();
	}

	System.out.println("WAP TO PRINT ALPHABETS 'A-P' IN 4 COLUMN ");
	for(int i=1;i<=n;i++)
	{	for(int j=1;j<=n;j++)
		{	System.out.print(ch+" ");	ch++;
		}
		System.out.println();
	}
	
	System.out.println("WAP TO PRINT NUMBERS '1-16' IN 4 COLUMN ");
	for(int i=1;i<=n;i++)
	{	for(int j=1;j<=n;j++)
		{	System.out.print(num+"   ");	num++;
		}
		System.out.println();
	}
	
	System.out.println("WAP TO PRINT 'AAAA 1111 BBBB 2222' IN ALL THE ROWS");
	char ch1='A';  int num1=1;
	for(int i=1;i<=n;i++) 
	{		
		for(int j=1;j<=n;j++) 
		{
			if(i%2!=0) 
			{
			System.out.print(ch1+" ");				}ch1++;
			{System.out.print(num1+ " ");		}num++;
		}   		System.out.println(); 
	}
	
	
	
	
	
}
}