class Program11
{
	public static void main (String[]args)
	{
		char  ch='R';
		if(ch>='A'&&ch<='Z')
		{
			System.out.println("Uppercase");
		}
		else if(ch>='a'&&ch<='z')
		{
			System.out.println("Lowercase");
		}
		else if(ch>='0'&&ch<='9')
		{
			System.out.println("Number");
		}
		else
		{
			System.out.println("Special  Character");
		}
	}
}