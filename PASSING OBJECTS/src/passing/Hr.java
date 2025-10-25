package passing;

import java.util.Scanner;

public class Hr {
	static void displayEmpdetails(Employee e)
	{
		if(e!=null)
		{
			System.out.println("Employee id:  "+e.eid);
			System.out.println("Employee ctc: "+e.ctc);
			
		}
	}

	static Employee createEmployee()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Employee id");
		int eid=scn.nextInt();
		
		System.out.println("Enter Employee ctc");
		double ctc=scn.nextDouble();
		
		Employee e=new Employee();
		
	}
}
