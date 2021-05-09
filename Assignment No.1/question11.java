//Are and Perimeter of circle

import java.util.Scanner;
class Question11
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Radius:");
		double a=sc.nextDouble();
		
		System.out.println("Perimeter is="+2*3.141592653589793238*a);
		System.out.println("Area is="+3.141592653589793238*a*a);
	}
}