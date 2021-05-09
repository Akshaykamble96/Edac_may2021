//Average of three numbers

import java.util.Scanner;
class Question12
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("First Number:");
		int a=sc.nextInt();
		System.out.print("Second Number:");
		int b=sc.nextInt();
		System.out.print("Third Number:");
		int c=sc.nextInt();
		
		System.out.println("Average:"+(a+b+c)/3);
	}
}
		