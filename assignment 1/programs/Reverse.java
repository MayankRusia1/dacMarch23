import java.util.Scanner;
public class Reverse
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter number:-");
int x=sc.nextInt();
int a;
int rev=0;
while(x>0)
         {
			a=x%10;
			rev=rev*10+a;
			x=x/10;
		 }	
System.out.println("Reverse of no. is:-"+rev);

}}