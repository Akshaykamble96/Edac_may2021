//Multiplication Table
import java.util.Scanner;
class Question7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int a=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+"*"+i+"="+a*i);
		}
	}
}