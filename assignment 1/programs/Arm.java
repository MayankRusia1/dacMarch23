import java.util.Scanner;
public class Arm
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:-");
		int a= sc.nextInt();
		int b,c,d,e,dgt=0;
		b=a;
		double sum=0;
		while(b>0)
		{
			c=b%10;
			dgt++;
			b=b/10;
		}
		d=a;
		while(d>0)
		{
			e=d%10;
			sum= sum+Math.pow(e,dgt);
			d=d/10;
		}
		if(sum==a)
		{
		System.out.println("Armstrong number");
	}
	else
	{
		System.out.println("Not a Armstrong Number");
	}
	}
}