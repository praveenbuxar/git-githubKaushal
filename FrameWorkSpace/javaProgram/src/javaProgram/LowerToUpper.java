package javaProgram;

import java.util.Scanner;

public class LowerToUpper {

	public static void main(String[] args) 
	{
		String s="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String from user");
		s=in.nextLine();
		for(int i=0;i<s.length();i++)
		{
			int ch=s.charAt(i);
			if(ch>=65&&ch<=90)
			{
				ch=ch-32;
				System.out.print((char)ch);
			}
			if(ch>=97&&ch<=122)
			{
				ch=ch+32;
				System.out.print((char)ch);
			}
		}
	}

}
