import java.util.Scanner;
public class SumOfDigits
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter number:-");
int a=sc.nextInt();
int s=0,b;
			while(a>0)
				{
					b=a%10;
					s=s+b;
					a=a/10;
				}
System.out.println("Sum of digits are:- " +s);
}
}
