import java.util.Scanner;
public class Palindrome
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number:-");
int a=sc.nextInt();
int rev=0,b,c;
c=a;
while(c>0)
{
b=c%10;
rev=rev*10+b;
c=c/10;
}
if(rev==a)
{
System.out.println("Palindrome number");
}
else
{
System.out.println("NOT a Palindrome number");
}
}}