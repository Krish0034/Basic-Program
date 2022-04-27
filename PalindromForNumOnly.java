/* Palindrom Number is a Number that is same after Reverse 
  ex: 545,121,34343, LOL, MADAM */
package BASIC;
import java.util.Scanner;
public class PalindromForNumOnly
{
	static boolean isPalindrom(int n)
	{
		int temp,sum=0,rem;
		temp=n;
		if(n<10 && n>=0)
			return true;
		while(temp>0)
		{
			rem=temp%10;
			sum=(sum*10)+rem;
			temp=temp/10;
		}
		if(sum==n)
			return true;
		return false;
	}
	public static void main(String []arg)
	{
		System.out.println("Enter the Number to Check Panlindrom: ");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		s.close();
		if(isPalindrom(num))
			System.out.println("Panlindrom Number.");
		else
			System.out.println("Not Panlindrom Number.");
	}
}