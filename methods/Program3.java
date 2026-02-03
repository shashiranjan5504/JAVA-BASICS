class Program3
{
	static void help()
	{
		System.out.println("Executing help().......");
	}
	static void check()
	{
		System.out.println("Executing cehck().......");
	}
	static void verify()
	{
		System.out.println("Executing verify().......");
	}
	public static void main (String [] args)
	{
		System.out.println("Program Starts ");
		check();
		help();
		verify();
		System.out.println("Program Ends");
	}
}