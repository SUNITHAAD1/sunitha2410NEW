package passing;

public class Studentmainclass {
	
	public static void main(String[] args) 
	{
		Student s1=College.creatStudent();
		College.displayStudentInfo(s1);
		
		Student s2=College.creatStudent();
		College.displayStudentInfo(s2);

		Student s3=College.creatStudent();
		College.displayStudentInfo(s3);


	}

}
