package CHETHANSIRPROGRAM;

public class String21ProgramOnwards {
public static void main(String[] args) {
	System.out.println("WAP TO COUNT ALL THE PALINDROMES IN THE GIVEN SENTENCE");
	String s="WOW IT IS RACECAR";   // WOW AND RACECAR ARE PALINDROME   
	String[] str = s.split(" ");
	int count=0;
	for(int i=0;i<=str.length;i++)
	{		String s2=str[i];
    			String rev="";
	
			for(int j=s2.length()-1;j>=0;j--)
			{
				rev=rev+s2.charAt(j);
			}
			if(rev.equals(s2))
			{			count++;			}
				
		
		
	}System.out.println("Total no. of Palindromes in the sentence is:"+count);
	
	
	
	
	
	
	/*
	// wap to check the given string is palindrome or not
	String str="wow";
	String s1="";
	for(int i=str.length()-1;i>=0;i--)
	{
		char ch=str.charAt(i);
		s1=s1+ch;
	}
	System.out.println("str:"+str);
	System.out.println("s1 :"+s1);
	if(s1.equals(str))
	{
		System.out.println("String is Palindrome");
	}
	else
	{
		System.out.println("String is not palindrome");
	}
	*/
	
	
	
}
}
