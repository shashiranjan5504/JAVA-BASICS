import java.util.Scanner;//1
class Program1
{
	public static void main (String[]args)
	{
		Scanner scn=new Scanner (System.in);//2
		System.out.println("Enter the value");
		int val=scn.nextInt();//3
		System.out.println("value:"+val);
	}
}