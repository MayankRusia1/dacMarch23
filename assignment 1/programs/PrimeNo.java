import java.util.*;
public class PrimeNo{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:-");
		int a= sc.nextInt();
		int i;
		boolean flag=false;
		for(i=2;i<a;i++)
		{
			if(a%i==0)
			{
				i++;
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Not a Prime No.");
		}
		else{
			System.out.println("Prime No.");
		}
	}
}
