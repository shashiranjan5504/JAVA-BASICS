class Program11
{
	static int test()
	{
		return 45;
		
	}
	public static void  main (String [] args)
	{
		int val=test();
		System.out.println("returned value :"+val);
		
		System.out.println("returned value :"+test());
	}
}