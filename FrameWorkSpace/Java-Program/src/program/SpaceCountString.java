package program;

import java.util.Scanner;

public class SpaceCountString {

	public static void main(String[] args)
	{
		String original;
		Character ch=' ';
		int count=0;
		Scanner in=new Scanner(System.in);
		System.out.println("ENter a string from user");
		original=in.nextLine();
		for(int i=0;i<original.length();i++)
		{
			char ch1=original.charAt(i);
			if(ch==ch1)
			{
				count++;
			}
		}
		System.out.println("the total number of space is "+count);
		

	}

}
