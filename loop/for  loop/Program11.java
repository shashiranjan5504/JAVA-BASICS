class Program11
{
	public static void main (String[]args)
	{
		int n=5;
		int val=1;
		for(int i=0;i<5;i++)
		{
			if(i<=2)
			{
				System.out.print(val+" ");
				val++;
			}
			else
			{
				--val;
				System.out.print(val-1+" ");
				//val--;
			}
		}
	}
}