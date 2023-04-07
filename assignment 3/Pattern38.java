public class Pattern38
{
public static void main(String[] args)
{
for(int i=1;i<=9;i++)
		{
			for(int j=8;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		int z=8;
		for(int l=1;l<=8;l++)
		{
			for(int m=1;m<=l;m++)
			{
				System.out.print(" ");
			}
			for(int n=z;n>=1;n--)
			{
				System.out.print("*");
			}
			System.out.println();
		z--;
		}
}}