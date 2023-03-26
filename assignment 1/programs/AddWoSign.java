import java.util.Scanner;
class AddWoSign
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers:-");
		int a=sc.nextInt();
		int b= sc.nextInt();
		for(int i=1; i<=b;i++)
		{
			a++;
		}
		System.out.println("Sum is:-" +a);
	}
}