//Swap two variable

import java.util.Scanner;
class Question15
{
	public static void main(String args[])
	{
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.print("First Number a=");
		int a=sc.nextInt();
		System.out.print("Second Number b=");
		int b=sc.nextInt();
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("Swap numbers:"+"a="+a+" "+"b="+b);
	}
}