class Square5
{
	public static void main(String[]args)
	{
		int n=5;
		
		for(int i=0;i<n;i++)//no of  rows
		{
			char val='a';
			for(int j=0;j<n;j++)//no of columns
			{
				System.out.print(val+" ");
				val++;
			}
			System.out.println();//move the cursir from same line to beginning to next line
			
		}
	}
	
}