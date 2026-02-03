class Program14
{
	public static void main (String[]args)
	{
		double  accBal=10000.0;
		int amt=130;
		if(amt<=accBal)
		{
			if (amt%100==0)
			{
				System.out.println("Withdrawal Success");
			}
			else
			{
				System.out.println("Invalid Denomination");
			}
		}
		
		else
		{
		System.out.println("Innsuffiicient Balance");
		}	
	}
}