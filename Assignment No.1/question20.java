//convert decimal number into hexadecimal number

iimport java.util.Scanner;
class Question20
{
	public static void main(String args[])
	{
		char hexa[]=new char [20];
		int rem, index=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Decimal Number a=");
		int a=sc.nextInt();
		
		while(a>0)
		{
			rem=a%16;
			if(rem<10)
			{
				hexa[index++]=(char)(48+rem);
			}
			else
			{
				hexa[index++]=(char)(55+rem);
			}
				
			a=a/16;
		}
		System.out.print("Hexadecimal number is: ");
		for(int i=index-1;i>=0;i--)
		{
			System.out.print(hexa[i]);
		}
	}
}