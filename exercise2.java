package exercise2;
import java.util.Scanner;
public class exercise2
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		int result = 1, i;
		for (i=1; i<=n; i++)
		{
			result = result * i;
		}
		System.out.println("The factorial of " +n+ " is " + result);
	}
	
}
//if n = 5
//for i = 1, result = 1*1=1, i+1=2
//for i=2, result = 1*2=2, i+1=3
//for i=3, result = 2*3=6, i+1=4
//for i=4, result = 6*4=24, i+1=5
//for i=5, result = 24*5=120, i+1=6 and i>n so stop


