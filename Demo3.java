/*Can you keep more than one main() method in a single class */
class Demo3
{
	public static void main(String []arg)
	{
		System.out.println("Orignal Main Method.");
		main(100);
	}
	static public void main(int ar)
	{
		System.out.println("Duplicate Main Method: "+ar);
	}
}
