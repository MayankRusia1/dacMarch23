import java.util.Scanner;
public class DigitPrint
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter number:-");
int a=sc.nextInt();
int j=0;
while(a>0)
{
	j=a%10;
	System.out.println(j);
	a=a/10;
}
}
}