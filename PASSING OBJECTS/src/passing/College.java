package passing;

import java.util.Scanner;

public class College {
	static void displayStudentInfo(Student s)
	{
		if(s!=null)
		{
			System.out.println("yop"+s.yop);
			System.out.println("cgpa"+s.cgpa);
			System.out.println("Email:"+s.email);
		}
	}
	
	static Student creatStudent()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter YOP");
		int yop=scn.nextInt();
		System.out.println("Enter CGPA");
		double cgpa=scn.nextDouble();
		System.out.println("Enter Email");
		String email=scn.next();
		
		Student s= new Student(yop,cgpa,email);
		return s;
	}

}
