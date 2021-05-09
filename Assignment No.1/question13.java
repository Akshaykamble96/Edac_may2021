//Area and Perimeter of Rectangle

import java.util.Scanner;
class Question13
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Width:");
		float a=sc.nextFloat();
		System.out.print("Height:");
		float b=sc.nextFloat();
		
		System.out.println("Area is"+" "+a+"*"+b+"="+(a*b));
		System.out.println("Perimeter is"+" "+2+"*"+(a+"+"+b)+"="+(2*(a+b)));
	}
}