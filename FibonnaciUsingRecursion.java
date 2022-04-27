package BASIC;
import java.util.Scanner;
public class FibonnaciUsingRecursion
{
	static int n1=0,n2=1,n3=0;
	public static void FibonnaciSeries(int size)
	{
		if(size>0)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			FibonnaciSeries(size-1);
		}
			
	}
	public static void main(String []arg)
	{
		System.out.println("Enter the Size: ");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		System.out.print(n1+" ");
		FibonnaciUsingRecursion.FibonnaciSeries(size-2);
	}
}