package exercise3;
import java.util.Scanner;
public class exercise3 {
	public static void main(String[] args) {
		int n,m;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a number , ");
		n = input.nextInt();
		System.out.println("Multiplication table for"+ n+ " : ");
		input.close();
		for (m=1; m<=10; m++) { 
			
		System.out.println(n + " * " + m + " = " + (n * m));
		}
	}
	
}
// if n=7
//for m = 1, result = 7*1=7 then m=1+1=2	 
//for m = 2, result = 7*2=14 then m=2+1=3
//for m = 3, result = 7*3=21 then m=3+1=4
//for m = 4, result = 7*4=28 then m=4+1=5
//for m = 5, result = 7*5=35 then m=5+1=6
//for m = 6, result = 7*6=42 then m=6+1=7
//for m = 7, result = 7*7=49 then m=7+1=8
//for m = 8, result = 7*8=56 then m=8+1=9
//for m = 9, result = 7*9=63 then m=9+1=10
//for m = 10, result = 7*10=70 then m=10+1=11 m>10 so stop