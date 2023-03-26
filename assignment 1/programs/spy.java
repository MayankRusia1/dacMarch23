import java.util.Scanner;
public class spy
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter number:-");
int b= sc.nextInt();
int c;
int sum=0,p=1;
while(b>0)
{
	c = b % 10;
	sum = sum + c;
	p = p * c;
	b = b / 10;
}
if(p == sum)
{
	System.out.println("Spy number");
}
else
{
	System.out.println("Not Spy number");
}
}
}