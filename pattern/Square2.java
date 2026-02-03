class Square2
{
	public static void main(String[]args)
	{
		int n=5;
		char val='a';//decide the size of  square  
		for(int i=0;i<n;i++)//no of  rows
		{
			for(int j=0;j<n;j++)//no of columns
			{
				System.out.print(val+" ");
			}
			System.out.println();//move the cursir from same line to beginning to next line
			val++;
		}
	}
	
}