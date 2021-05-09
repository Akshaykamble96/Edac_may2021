//Convert decimal to binary number

import java.util.Scanner;
class Question19
{
	public static void main(String args[])
	{
		int binary[]=new int [20];
		int index=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Decimal Number a=");
		int a=sc.nextInt();
		
		while(a>0)
		{
			binary[index++]=a%2;
			a=a/2;
		}
		System.out.print("Binary number is: ");
		for(int i=index-1;i>=0;i--)
		{
			System.out.print(binary[i]);
		}
	}
}
