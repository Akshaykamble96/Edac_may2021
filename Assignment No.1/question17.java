// Binary addition 

import java.util.Scanner;
class Question17
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		int i=0,carry=0;
		int [] sum = new int [20];
		System.out.print("Enter first binary number: ");
		long b1 = s.nextLong();
		System.out.print("Enter second binary number:");
		long b2 = s.nextLong();
		while(b1!=0 || b2!=0)
		{
			sum[i]=(int)(( b1%10 + b2%10 + carry)%2);
			i++;
			carry=(int)(( b1%10 + b2%10 + carry)/2);
			b1=b1/10;
			b2=b2/10;
		}
		if (carry!=0)
		{
			sum[i]=carry;
			i++;
		}
		i--;
		System.out.print("Sum of two binary number:");
		while(i>=0)
		{
			System.out.print(sum[i]);
            i--;
		}
	}
}