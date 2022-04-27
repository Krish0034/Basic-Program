/* Prime Number: it is greater than 1 and divisible by 1 and itself. */
package BASIC;
import java.util.Scanner;
public class BetweenCheckPrime
{
	static boolean isPrime(int n)
	{
		if(n<1)
			return false;
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%2==0)
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String []arg)
	{
		System.out.println("Enter the first Number: ");
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
	    System.out.println("Enter the second Number: ");
		int num2=s.nextInt();
		s.close();
		for(int i=num1;i<=num2;i++)
		{
		if(isPrime(i))
			System.out.println("Prime Number: "+i);
		else 
			System.out.println("Not Prime Number: "+i);
		}
	}
}