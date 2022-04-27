/* Armstrong Number is a +ve m-digit numbers that is equal to the sum of the Mth power of their digits.
  ex: 153=1^3+5^3+3^3=153
      1634=1^4+6^4+3^4+4^4=1634
*/
package BASIC;
import java.util.Scanner;
import java.math.*;
public class ArmstrongNum
{
	static boolean isArmstrong(int num)
	{
		int temp,count=0,rem,sum=0;
		temp=num;
		if(num>=1 && num<=9)
			return true;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		temp=num;
		while(temp>0)
		{
			rem=temp%10;
			sum=sum+(int)(Math.pow(rem,count));
			temp=temp/10;
		}
		if(sum==num)
			return true;
		return false;
	}
	public static void main(String []arg)
	{
		System.out.println("Enter number to check Armstrong Number: ");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(isArmstrong(num))
			System.out.println("Armstrong Number");
		else 
			System.out.println("Not Armstrong Number");
	}
}