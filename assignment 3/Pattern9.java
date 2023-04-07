public class Pattern9
{
public static void main(String[] args)
{
	int a=6;
		for(char i='A';i<='E';i++)
		{
		      a--;
			for(int k=1;k<=a;k++)
			{
				System.out.print(" ");			//1 space
			}
	         for(char j='A';j<=i;j++)
			    {
				    System.out.print(j+" ");
				    }
			System.out.println();
		}
}}