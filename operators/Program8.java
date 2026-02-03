//write a program to calculate  the simple interest using given data  ,principal=100000,rate=12.5,tenure=2,simple interest=?


class  Program8
{
	public static void main (String[]args)
{
		double principal=100000.0;
		double rate=12.5;
		int tenure=2;
		double simple_interest=(principal*rate*tenure)/100;
		System.out.println(simple_interest);
		
		double totalRepayment=principal+simple_interest;
		double emi=totalRepayment/(12*tenure);
		System.out.println(emi);
		
}
}