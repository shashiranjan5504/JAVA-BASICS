class Program8
{
	static void help  (boolean b)
	{
		System.out.println("Value passed :"+b);
	}
	static void play(char ch)
	{
		System.out.println("Value passed :"+ch);
		help(true);
	}
	public static void main (String []args)
	{
		play('J');
	}
}
