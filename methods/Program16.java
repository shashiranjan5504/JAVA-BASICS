class Program16
{
	static boolean  checkOverSpeed (int speed)
	{
		boolean bool=speed>80;
		return bool;
		
	}
	public static void main (String[]args)
	{
		System.out.println("Overspeed fine : "+checkOverSpeed(60));
		System.out.println("Overspeed fine : "+checkOverSpeed(90));
		
		
	}
}
