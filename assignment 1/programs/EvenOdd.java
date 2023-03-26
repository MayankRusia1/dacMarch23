//1st way
/*
import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:-");
		int a=sc.nextInt();
		String x=(a%2==0)? "Even" : "Odd";
		System.out.println(x);
	}
}
*/
//2nd way

import java.util.Scanner;
class EvenOdd
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter number to check whether it is Even / Odd..:-");
int ch=sc.nextInt();
if(ch%2==0)
{
System.out.println("EVEN number..");
}
else
{
System.out.println("ODD number..");
}
}
}