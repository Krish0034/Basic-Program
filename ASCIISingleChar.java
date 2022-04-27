/* A to Z=65 to 90
   a to z=97 to 122
  All Character= 0 to 255

*/  
package BASIC;
import java.util.Scanner;
public class ASCIISingleChar
{
	public static void main(String []arg)
	{
		char ch;
		System.out.println("Enter Character to Print ASCII Value: ");
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
		int value=ch;  //char type Assignig into int type
		int value1=(int)ch;  //Type Casting
		System.out.println(value);
		System.out.println(value1);
	}
}