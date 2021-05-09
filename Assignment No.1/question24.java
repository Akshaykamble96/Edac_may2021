//binary to octal conversion

import java.util.Scanner;
class Question24
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the binary Number a=");
	    int a=sc.nextInt();
	
	    int base =1;
	
	    int dec_value =0;
	
	    while(a>0)
		{
			int rem=a%8;
		    a=a/8;
		    
		}
		
	    System.out.println("Octal number:"+rem);
	}
}