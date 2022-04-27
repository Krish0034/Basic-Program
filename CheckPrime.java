/* Prime Number: it is greater than 1 and divisible by 1 and itself. */
package BASIC;
import java.util.Scanner;
public class CheckPrime
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
		System.out.println("Enter the Number to check Prime No.: ");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		s.close();
		if(isPrime(num))
			System.out.println("Prime Number");
		else 
			System.out.println("Not Prime Number");
	}
}