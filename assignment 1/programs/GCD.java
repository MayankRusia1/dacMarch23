import java.util.Scanner;
    public class GCD   
    {  
    public static void main(String[] args)   
    {
	Scanner sc= new Scanner(System.in);
    int gcd = 1;
    int i;
  //Accepting two numbers	
	System.out.println("Enter two numbers:-");
	int x = sc.nextInt();
	int y = sc.nextInt();
	
// loop for (x,y) from 1 to last no.
    for(i = 1; i <= x && i <= y; i++)  
    {  

//condition check...
    if(x%i==0 && y%i==0)  
    gcd = i;  
    }  	
	
//print GCD
    System.out.printf("GCD of %d and %d is: %d", x, y, gcd);  
    }  
    }  