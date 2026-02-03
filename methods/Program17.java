class  Program17
{
	static double applydiscount(double price,double discount)
	{
		double afterDiscount=price-(price*discount/100);
		return afterDiscount;
	}
	public static void main (String[] args)
	{
		System.out.println("After Discount:"+applydiscount(1000.0,10.0));
		System.out.println("After Discount:"+applydiscount(12500.0,15.0));
	}
}