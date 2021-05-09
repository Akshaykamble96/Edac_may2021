//convert decimal number into octal number

import java.util.Scanner;
class Question21
{
	public static void main(String args[])
	{
		int octal[]=new int [20];
		int index=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Decinal Number a=");
		int a=sc.nextInt();
		
		while(a>0)
		{
			octal[index++]=a%8;
			a=a/8;
		}
		System.out.print("Octal number is: ");
		for(int i=index-1;i>=0;i--)
		{
			System.out.print(octal[i]);
		}
	}
}
