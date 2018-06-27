package javaProgram;

import java.util.Scanner;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) 
	{
		String original="";
		String ans="";
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String from user");
		original=in.nextLine();
		for(int i=0;i<original.length();i++)
		{
			if(original.charAt(i)!=' ')
			{
				char ch1=original.charAt(i);
				ans=ans+ch1;
				original=original.replace(ch1, ' ');
			}
		}
		System.out.println(ans);

	}

}
