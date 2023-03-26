import java.util.Scanner;
public class Factors
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to find its factors:-");
		int a=sc.nextInt();
		int i=1;
		while(i<=a)
		{
			if(a%i==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}