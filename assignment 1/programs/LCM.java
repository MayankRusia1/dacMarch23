import java.util.Scanner;
public class LCM
{
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter two numbers:-");
	int x=sc.nextInt();
	int y=sc.nextInt();
	int gcd=0;
	int i;
	for(i=1;i<=x && i<=y; i++)
	{
		if(x%i==0 && y%i==0)
		{
			gcd=i;
		}
	}
	//System.out.println("GCD is:- "+gcd);
	int lcm=((x*y)/gcd);
	System.out.println("LCM is:- "+lcm);	
}
}