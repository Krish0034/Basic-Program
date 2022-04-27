/*Fibonnaci Series: 0 1 1 2 3 5 8 13 21..... */
package BASIC;
import java.util.Scanner;
public class FibonnaciSeriesWithoutRecursion
{
	public static void main(String []args)
	{
		int n1=0,n2=1,n3,size;
		System.out.println("Enter the Number of Size: ");
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		s.close();
		System.out.print(n1+" "+n2);
		for(int i=2;i<size;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}