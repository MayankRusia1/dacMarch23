public class Pattern31
{
public static void main(String[] args)
{
for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		int a=2;
		for(int i=5;i>=1;i--)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=a;k++)
			{	
		        if(a<=5)
				{
				System.out.print("*");
			}}
			a++;
			System.out.println();
		}
		

}}
