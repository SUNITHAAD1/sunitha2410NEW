package passing;

import java.util.Scanner;

public class Hospital {
	
	static void showPatientDetails(Patient p)
	{
		if(p!=null)
		{
			System.out.println("Age"+p.age);
			
		}
	}
	
	static Patient createPatient()
	{
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter Age");
		int age=scn.nextInt();
		System.out.println("Enter ID");
		int id=scn.nextInt();
		
		Patient p=new Patient(age, id);
		return p;
	}

}
