package exercise1;
public class exercise1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int n = 1; n<=10; n++) {
			sum +=n;
		
		}
		System.out.println("The sum of number from 1 to 10 is " + sum);
	}
}

//for n = 0, sum = 0+0=0 then n=0+1=1
//for n = 1, sum = 0+1=1 then n=1+1=2	 
//for n = 2, sum = 1+2=3 then n=2+1=3
//for n = 3, sum = 3+3=6 then n=3+1=4
//for n = 4, sum = 6+4=10 then n=4+1=5
//for n = 5, sum = 10+5=15 then n=5+1=6
//for n = 6, sum = 15+6=21 then n=6+1=7
//for n = 7, sum = 21+7=28 then n=7+1=8
//for n = 8, sum = 28+8=36 then n=8+1=9
//for n = 9, sum = 36+9=45 then n=9+1=10
//for n = 10, sum = 45+10=55 then n=10+1=11 n>10 so stop