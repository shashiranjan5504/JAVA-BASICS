class Square8
{
	public static void main(String[]args)
	{
		int n=5;
		
		
		for(int i=0;i<n;i++)//no of  rows
		{
			
			for(int j=0;j<n;j++)//no of columns
			{
				if(j%2==0)
				{
					System.out.print(1+" ");
				}
				else
				{
					System.out.print(0+" ");
				}
				
			}
			System.out.println();//move the cursor from same line to beginning to next line
			
		}
	}
	
}