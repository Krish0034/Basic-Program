package BASIC;
import java.util.Scanner;
public class FactorialWithoutRecursion
{
	public static void main(String []arg)
	{
		int fact=1;
		System.out.println("Enter the Number: ");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num>0)
		{
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is: "+fact);
		}
		else
			System.out.println("Factorial of "+num+" is: "+fact);
	}
}