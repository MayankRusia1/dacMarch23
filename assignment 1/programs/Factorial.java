import java.util.Scanner;
public class Factorial
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number of whose want to find factorial:-");
int x=sc.nextInt();
int f=1;
for(int i=x;i>=1;i--)
{
f=f*i;
}
System.out.println("Factorial of ("+x+") is:- "+f);
}
}