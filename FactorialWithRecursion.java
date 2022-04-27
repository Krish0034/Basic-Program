/* 5=5*4*3*2*1
   0=1
   6=6*5*4*3*2*1   */
package BASIC;
import java.util.Scanner;
public class FactorialWithRecursion
{
	static int Factor(int n)
	{
		if(n==0)
			return 1;
		else 
			return (n*Factor(n-1));
	}
	public static void main(String []args)
	{
		System.out.println("Enter the Number To calculate Factorial: ");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		s.close();
		int fact=FactorialWithRecursion.Factor(num);
		System.out.println("Factorial: "+fact);
		
	}
}