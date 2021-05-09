//convert Binary  to decimal number

import java.util.Scanner;
class Question22
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the binary Number a=");
	int a=sc.nextInt();
	
	int base =1;
	
	int dec_value =0;
	
	while(a>0)
	{
		int rem=a%10;
		a=a/10;
		dec_value+=rem*base;
		base=base*2;
	}
	System.out.println("Decimal number:"+dec_value);
	}
}
