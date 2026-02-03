class Program15
{
	public static void main (String[]args)
	{
		char  gender='B';
		int age  =10;
		if(gender=='M')
		{
			if (age>=21)
			{
				System.out.println("Eligible Bachelor");
			}
			else
			{
				System.out.println("Underage Boy");
			}
		}
		
		else if (gender=='F')
		{
			if (age >=18)
			{
				System.out.println("Eligible  Spinster");
			}
			else
			{
				System.out.println("Underage  Girl");
			}
			
		}
		else
		{
			System.out.println("Invalid  Gender");
		}
			
	}
}