import java.util.Scanner;
class Program3
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the 1st value ");
		double num1= scn.nextDouble();
		System.out.println("Enter the 2nd value ");
		double num2= scn.nextDouble();
		double sum=num1+num2;
		System.out.println("Result :"+sum);
	}	
}