public class Pattern10
{
public static void main(String[] args)
{
int a=6;
		for(char i='E';i>='A';i--)
		{
		      a--;
			for(int k=1;k<=a;k++)
			{
				System.out.print(" ");			//1 space
			}
	         for(char j=i;j<='E';j++)
			    {
				    System.out.print(j+" ");
				    }
			System.out.println();
		}
}}