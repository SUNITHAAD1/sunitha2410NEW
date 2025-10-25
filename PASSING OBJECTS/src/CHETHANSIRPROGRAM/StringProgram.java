package CHETHANSIRPROGRAM;

import java.util.Arrays;

public class StringProgram {
public static void main(String[] args) {
	/*
	System.out.println(" 1. WAP TO FIND THE LENGTH OF THE GIVEN STRING");
	String name="SuNi";
	System.out.println("Length of the given string is:"+name.length());
	System.out.println(".....................................");
	
	System.out.println("2.111 WAP TO CONVERT STRING INTO CHARACTER ARRAY");
	char[] ch=name.toCharArray();
	for(int i=0;i<name.length();i++) {      System.out.println(ch[i]);		}
	System.out.println(".....................................");
			
	System.out.println("2.222 WAP TO CONVERT CHARACTER ARRAY INTO STRING");
	char[] groupofchar={'p','r','i','s','h','a'};
	String sobj=new String(groupofchar);
	System.out.println(sobj);
	System.out.println(".....................................");
	
	System.out.println("3. WAP TO CONVERT LOWERCASE TO UPPERCASE");
	System.out.println(name.toUpperCase());
	System.out.println(".....................................");

	System.out.println("4. WAP TO CONVERT UPPERCASE TO LOWERCASE");
	System.out.println(name.toLowerCase());
	System.out.println(".....................................");
	 
	System.out.println("5. WAP TO CONVERT LOWERCASE TO UPPERCASE WITHOUT USING BUILT IN FUNCTION");
	//A=65    ,a=97    difference is 32
	String lower="lovely";
	String lower1="";
	for(int i=0;i<lower.length();i++)
	{  char cccc= lower.charAt(i);
		lower1=lower1+(char)(cccc-32);	
	}	System.out.println("lower case converted to upper case:"+lower1);
	System.out.println(".....................................");
	
	System.out.println("6. WAP TO CONVERT UPPERCASE TO LOWERCASE & VICE VERSA WITHOUT USING BUILT IN FUNCTION");
	String upperx="LALBAUGH";
	String lowerx="prisha";
	String upper1="";
	String lowerx1="";
	for(int i=0;i<upperx.length();i++)
	{		char charupper = upperx.charAt(i);
			upper1=upper1+(char)(charupper+32);			}
			System.out.println("uppercase converted to lower case:"+upper1);
	for(int i=0;i<lowerx.length();i++)
	{		char clow=lowerx.charAt(i);
			lowerx1=lowerx1+(char)(clow-32);				}
			System.out.println("lower case converted to upper case:"+lowerx1);
			System.out.println(".....................................");
			
	System.out.println("7. WAP TO COUNT NUMBER OF DIGITS IN THE GIVEN STRING");
	String s1Digit="Ravikumar12345";
	int count=0;
		for(int i=0;i<s1Digit.length();i++)
		{
		char cchh = s1Digit.charAt(i);
		if(cchh>='0' && cchh<='9')		{		count++;			}
		}System.out.println("Total characters in the given string: "+count);	
		System.out.println(".....................................");
			
	System.out.println("8. WAP TO COUNT SUM OF DIGITS IN THE GIVEN STRING");
	String nameDigit="A1";
		int sum=0;
		for(int i=0;i<nameDigit.length();i++)
		{	char cha = nameDigit.charAt(i);	
			if(cha>='0' && cha<='9')
			{sum=sum+cha;		}
		}	System.out.println("Sum of digit in the given string is:"+sum);
		System.out.println(".....................................");
	
	System.out.println("9 WAP TO COUNT THE VOWELS AND CONSTANTS IN THE GIVEN STRING");
	String sname="PrishaNaidu";
	int vowels=0;
	int constants=0;
	for (int i=0;i<sname.length();i++)
	{
		char ca=sname.charAt(i);
		if(ca=='A' || ca=='E' || ca=='I'||ca=='O' || ca=='U' || ca=='a' || ca=='e' || ca=='i'||ca=='o' || ca=='u')
		  		 {vowels++;					}
			else {constants++;				}
	}
	System.out.println("Number of vowels in the string is:"+vowels);
	System.out.println("Number of Constants in the string is:"+constants);
	System.out.println(".....................................");
	
	System.out.println("10. WAP TO REVERSE THE GIVEN STRING");
	String str5="MAD";   // 
	String str6="";
	for(int i=str5.length()-1;  i>=0;   i--)
		{ char sr=str5.charAt(i);
		  str6=str6+sr;	}
	System.out.println("The Reverse of the given string is: "+str6);
	System.out.println(".....................................");
	
	System.out.println("11. WAP TO CHECK STRING PALINDROME OR NOT");
	String strp="MALAYALAM";     //MADAM  , WOW,  RACECAR, MALAYALAM
	String revp="";
	for(int i=strp.length()-1;   i>=0;   i--)
	{		char cp=strp.charAt(i);
			revp=revp+cp;
	}System.out.println("The given string is:"+strp);	
	System.out.println("The reverse of string is:"+revp);
		
		if(strp.equals(revp))
				{System.out.println("The given string is Palindrome");}
		else		{System.out.println("The given string is not palindrome");}
				System.out.println(".....................................");
	
	System.out.println("12. WAP TO VALIDATE THE GIVEN PASSWORD. PWD CONTAIN 8-15 CHAR, 1 UPPERCASE,1 LOWERCASE,1 NUMBER,1 SPECIAL CHARACTER AND NO SPACES");
	String pwd="SuniTHaA$@34758";
	int uppercase=0,lowercase=0,space=0,numbers=0,specialchar=0;
		if((pwd.length()>8)&&(pwd.length()<=15))
		{		for(int i=0;i<=pwd.length()-1;i++)
				{
				char cpwd=pwd.charAt(i);
				if(cpwd>='a' && cpwd<='z')
						{lowercase++;		}
				else if(cpwd>='A' && cpwd<='Z')
						{uppercase++;		}
				else if(cpwd>='0' && cpwd<='9')
						{numbers++;			}
				else if(cpwd==' ')
						{space++;			}
				else		{	specialchar++;		}
				}
		
		}
		if(uppercase>0 && lowercase>0 && numbers>0 && specialchar>0 && space==0)
				{			System.out.println("Password is valid.........");}
				else		{	System.out.println("Password is not valid..........");}
		System.out.println(".....................................");
	
	System.out.println("15. WAP TO REMOVE ALL THE CHARACTER SPACE IN THE GIVEN STRING ARRAY");
	
	String s15p="I am a programmer";
	System.out.println("BEFORE REMOVING THE CHARACTER SPACE IN THE GIVEN STRING ARRAY:"+s15p);
	String ss15p="";
	for(int i=0;i<s15p.length();i++)
	{char ch15p=s15p.charAt(i);
		if(ch15p!=' ') { ss15p=ss15p+ch15p;}			
	}System.out.println("AFTER REMOVING THE CHARACTER SPACE IN THE GIVEN STRING ARRAY:"+ss15p);
	
	System.out.println("16. WAP TO REMOVE ALLTHE BLANK SPACE IN THE GIVEN STRING BUILT IN FUNCTION METHODS");
	String s16="I Love my India";
	String s16s1="";
	String[] spacesplit = s16.split(" ");
	for(int i=0;i<spacesplit.length;i++)
	{	s16s1=s16s1+	spacesplit[i];		}
	System.out.println(s16s1);
	 */  
				/*	or
				for(int i=0;i<spacesplit.length;i++)
					{	System.out.print(spacesplit[i]); }
				 */
	
	/*
	System.out.println("17. WAP TO REPLACE ALL THE BLANK SPACED WITH THE SPECIAL CHARACTER");
	
	String str="I Love Bangalore";
	String s1=" ";
	for(int i=0;i<str.length();i++)
	{				 char c=str.charAt(i);
					if(c==' ')
										{	s1=s1+"@";		}
								else		{	s1=s1+c;			}
	}System.out.println(s1);
	
	System.out.println("18. WAP TO REVERSE THE GIVEN SENTENCE");
	String s="Sunitha likes Mysore because of beautiful culture";
	String s1=" ";
	String[] str = s.split(" ");
	for(int i=str.length-1;i>=0;i--)
	{		
		s1=s1+str[i]+" ";
	}System.out.println(s1);
	
	System.out.println("19. WAP TO REVERSE EACH WORD IN THE GIVEN STATEMENT IN THE SAME ORDER");
	String s="Sunitha love Mysore";
	String s1=" ";
	String[] str=s.split(" ");
	for(int i=0;i<str.length;i++)
	{	
		String s2=str[i];
		String rev="";
		for(int j=s2.length()-1;j>=0;j--)
		{
			rev=rev+s2.charAt(j);	
		}
		s1=s1+rev+" ";
		
	}System.out.println(s1);
	
	System.out.println("20. WAP TO REVERSE PARTICULAR WORD IN THE GIVEN SENTENCE");
	String s="Sunitha love Mysore";
	String s1=" ";
	String[] str=s.split(" ");
	for(int i=0;i<str.length;i++)
	{	String s2=str[i];
			if(s2.equals("love"))
			{	for(int j=s2.length()-1;j>=0;j--)
				{ 	String rev="";
					rev+=s2.charAt(j);
					s1=s1+rev+" ";
				}
			
			} else			
			
			{	s1=s1+s2+" ";	}
	}
	System.out.println("Particular word reversed and sentence:"+s1);
	
	
	System.out.println("21. WAP TO COUNT ALL THE PALINDROMES IN THE GIVEN SENTENCE");
	String s="wow ! love you madam";   //wow, racecar, malayalam
	String s1="";
	int count=0;
	String [] str=s.split(" ");	
	for(int i=0;i<str.length;i++)
	{
		String s2=str[i];
		String rev="";
		for(int j=s2.length()-1;j>=0;j--)
		{
			rev=rev+s2.charAt(j);
		}System.out.println("The Reversed string are: "+rev);
		
		if(rev.equals(s2))
		{		count++;			}
	}System.out.println("No. of palindromes in the String is: "+count);
	
	System.out.println("22. WAP TO PRINT ALL THE DUPLICATE CHARACTERS IN THE STRING");
	String s="sunithasuni";
	char[] ch=s.toCharArray();
	boolean [] b=new boolean[ch.length];
	for(int i=0;i<ch.length;i++)
	{
		int count=0;
		if(b[i]==false)
		{	for(int j=i+1;j<ch.length;j++) 
				{  if(ch[i]==ch[j])
						{count++;
						b[j]=true;
						}			
					}System.out.println("Duplicate character count is:"+count);

		if(count>0)
			{	System.out.println(ch[i]+"  : is a duplicate character repated ");    }
		}	
	}
	/*
	System.out.println(" 23.  WAP TO PRINT ALL THE UNREPEATED CHARACTERS IN THE STRING");
	String s="sunithasuni";
	char[] ch = s.toCharArray();
	boolean [] b = new boolean[ch.length];
	for(int i=0;i<=ch.length;i++)
	{	int count=0;
		if(b[i]==false)
		{
		for(int j=i+1;j<ch.length;j++)
		{	if(ch[i]==ch[j])
				{  count++;
					b[j]=true;
				}
		}	
		
		if(count==0)
		{
			System.out.println(ch[i]+" : unrepeated character");
		}
	}
	}
	
	System.out.println("24. wap to find the occurance or frequency of the given string");
	String s="ramravi";
	char[] c = s.toCharArray();
	boolean[] b = new boolean[c.length];
	for(int i=0;i<c.length;i++)
	{	int count=1;	
		if(b[i]==false)
		{
			for(int j=i+1;j<c.length;j++)
			{
					if(c[i]==c[j])
					{	count++;		
							b[i]=true;
					}
			}
		}System.out.println(c[i]+" Occurance in given String is:"+count+"times");
		
	}
	
	
	*/
	System.out.println("24. wap to check the given String is ANAGRAM or not");
	String s1="Silent";    //same length;  silent ==  listen
	String s2="Listen";
	if(s1.length()==s2.length())
	{
		String s3=s1.toLowerCase();
		String s4=s2.toLowerCase();
		
		char[] c1 = s3.toCharArray();
		char[] c2 = s4.toCharArray();
		
		Arrays.sort(c1);    
		Arrays.sort(c2);
		
		String s5 = new String(c1);
		String s6 = new String(c2);
		
		System.out.println("String s5 contains:"+s5);
		if(s5.equals(s6))
		{
			System.out.println("String is Anagram");
		}
		else
		{
			System.out.println("String is not Anagram");
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	/*
	String s1="sunithaNaidu";
	String str="suni";
System.out.println("specify the index location, will get character:"+s1.charAt(3));
System.out.println("In the string,   index value:"+s1.indexOf('i'));
System.out.println("In the string,   last Index value:"+s1.lastIndexOf('i'));    
System.out.println("convert to lower case:"+s1.toLowerCase());
System.out.println("convert to upper case:"+s1.toUpperCase());
System.out.println("string are equal :"+s1.equals(str));
System.out.println("strings case sensitive ignorance case:"+s1.equalsIgnoreCase(str));
System.out.println("String contains suni ????: "+s1.contains(str));
System.out.println("s1 comparing s2:"+s1.compareTo(str));
System.out.println("S1 string concatenating s2:"+s1.concat(str));
System.out.println("string ends with:"+s1.endsWith(str));
System.out.println("string start with:"+s1.startsWith(str));
s1.trim();
s1.strip();
*/
}

private static String str(int i) {
	// TODO Auto-generated method stub
	return null;
}
}
