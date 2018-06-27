package program;

import java.util.Scanner;

public class ReverseStringWord {

	public static void main(String[] args) 
	{
		String s;
		String rev="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string from user");
		s=in.nextLine();
		String[]str=s.split(" ");
		for(int i=str.length;i>=0;i--)
		{
			rev=rev+str+' ';
		}
		System.out.println(rev);

	}

}
