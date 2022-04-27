package BASIC;
import java.util.Scanner;
public class PalindromForString
{
	public static void main(String []arg)
	{
		String orig, rever="";
		System.out.println("Enter the String/Number");
		Scanner s=new Scanner(System.in);
		orig=s.nextLine();
		s.close();
		
		int len=orig.length();
		for(int i=len-1;i>=0;i--)
			rever=rever+orig.charAt(i);
		if(orig.equals(rever))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
	}
}