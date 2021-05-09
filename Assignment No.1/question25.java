//octal to decimal conversion

import java.util.Scanner;
class Question25
{
	public static void main(String[] args)
	{
		int rem, power=0,temp,decimal=0,octal;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter octal number:");
		octal= s.nextInt();
		while(octal>0)
		{
			temp=octal%10;
			octal=octal/10;
			decimal=decimal+temp*(int)Math.pow(8,power);
			power++;
		}
		System.out.print("Equivaent decimal number:");
		System.out.print(decimal);
	}
}