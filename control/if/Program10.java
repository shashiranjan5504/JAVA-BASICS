class Program10
{
	public static void main (String[]args)
	{
		int a=9;//we can check  the output for a=12,15,10,17
		if(a%2==0 && a%3==0)
		{
			System.out.println("Bangalore ");
		}
		else if (a%2==0)
		{
			System.out.println("Chennai");
		}
		else if (a%3==0)
		{
			System.out.println("Hyderabad");
		}
		else
		{
			System.out.println("Cochi");
		}
	}
} 