import java.util.Scanner;
class Program4
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Mobile Number ");
		long mobileNumber= scn.nextLong();
		System.out.println("Enter CGPA ");
		double cgpa= scn.nextDouble();
		System.out.println("Enter status(true/false)");
		boolean status=scn.nextBoolean();
		
		//PRINTING THE VALUES
		System.out.println("Mobile Number :"+mobileNumber);
		System.out.println("CGPA :"+cgpa);
		System.out.println("Status :"+status);
		
	}	
}