package program;

public class ReverseString 
{
	 static String str="kaushal";
	public static void main(String[]args)
	{
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}

}
