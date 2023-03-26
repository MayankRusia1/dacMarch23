import java.util.Scanner;
public class PosNeg
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number:-");
int a=sc.nextInt();
if(a==0)
{
	System.out.println("[0] is neither Positive nor Negative number...");
}
else if(a<0)
{
System.out.println("Negative number");
}
else
{
System.out.println("Positive number");
}
}
}
