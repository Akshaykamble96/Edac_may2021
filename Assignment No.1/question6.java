//Addition, Multiply, Division, Subtraction, Remainder of two number
import java.util.Scanner;
class Question6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("First Number:");
		int a=sc.nextInt();
		System.out.print("Second Number:");
		int b=sc.nextInt();
		
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"mod"+b+"="+(a%b));
	}
}