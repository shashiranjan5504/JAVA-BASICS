class Program12
{
	public static void main (String[]args)
	{
		int   age=2;
		if(age>=0&&age<=3)
		{
			System.out.println("FREE");
		}
		else if(age>3&&age<=10)
		{
			System.out.println("Half ");
		}
		else if(age >10&&age <60)
		{
			System.out.println("Full");
		}
		else
		{
			System.out.println("Senior Citizen Ticket");
		}
	}
}