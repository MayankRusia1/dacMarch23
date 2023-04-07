public class Pattern25
{
public static void main(String[] args)
{
int a=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=a;k++)
			{
				System.out.print("*");
			}
			a+=2;
			System.out.println();
		}
		int b=7;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=b;k>=1;k--)
			{
				System.out.print("*");
			}
			b-=2;
			System.out.println();
		}
		

}}