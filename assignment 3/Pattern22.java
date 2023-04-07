public class Pattern22
{
public static void main(String[] args)
{
int a=0;
		for(int i=5;i>=1;i--)
		{
			    a++;
				for(int k=1;k<=a;k++)
				{ 
     			System.out.print(" ");
				}
			    for(int j=1;j<=i;j++)
			    {
			    System.out.print("*");
			    }
			System.out.println();
		}
		

}}