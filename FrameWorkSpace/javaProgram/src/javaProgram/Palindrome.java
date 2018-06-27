package javaProgram;

import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		String original,reverse="";
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String value");
		original=in.nextLine();
		int len=original.length();
		for(int i=len-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse))
		{
			System.out.println("the string is palindrome");
		}
		else
		{
			System.out.println("the string is not palindrome");
		}
	}

}
