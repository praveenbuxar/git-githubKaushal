package javaProgram;

import java.util.Scanner;

public class SapceCount {

	public static void main(String[] args) 
	{
		String original="";
		char ch=' ';
		int count=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string from user");
		original=in.nextLine();
		for(int i=0;i<=original.length()-1;i++)
		{
			char ch1=original.charAt(i);
			if(ch==ch1)
			{
				count++;
			}
		}
		System.out.println("the number of space is:-" +count);

	}

}
