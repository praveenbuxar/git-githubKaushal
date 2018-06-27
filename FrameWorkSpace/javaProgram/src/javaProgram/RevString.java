package javaProgram;

public class RevString {

	public static void main(String[] args) 
	{
		String s="this is India";
		String rev="";
		String[]str=s.split(" ");
		for(int i=str.length;i>=0;i--)
		{
			rev=rev+str+" ";
		}
		System.out.println(rev);

	}

}
