package passing;

public class Mainclass {

	
	public static void main(String[] args) {
		Biryani b1=BiryaniHelper.createBiryani();
		BiryaniHelper.displayBiryaniProperties(b1);
		
		System.out.println("---------------------------");
		Biryani b2=BiryaniHelper.createBiryani();
		BiryaniHelper.displayBiryaniProperties(b2);
		
		System.out.println("---------------------------");
		Biryani b3=BiryaniHelper.createBiryani();
		BiryaniHelper.displayBiryaniProperties(b3);
		
		System.out.println("---------------------------");
		
	}
}
