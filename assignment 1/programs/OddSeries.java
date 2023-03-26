import java.util.Scanner;
public class OddSeries
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter choice upto which want to print odd no. series..:-");
		int ch=sc.nextInt();
		for(int i=1;i<=ch;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}
		