import java.util.Scanner;
public class EvenSeries
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter range upto which we want to print Even Number Series..:-");
	int ch=sc.nextInt();
	for(int i=0;i<=ch;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
	}
}
