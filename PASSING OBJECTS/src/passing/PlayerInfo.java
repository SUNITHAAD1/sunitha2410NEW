package passing;

import java.util.Scanner;

public class PlayerInfo {
	
	static void displayPlayerInfo(player p)
	{	if(p!=null)
	{
		System.out.println("Jno  "+p.jno);
		System.out.println("Player name"+p.name);
	}
		
	}


	
	static player PlayerInformation()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter J no");
	int jno=sc.nextInt();
	
	System.out.println("Enter Player name");
	String name=sc.next();
	
	player p=new player(jno,name);
			return p;
	}
	
}
