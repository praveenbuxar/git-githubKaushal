package program;

import java.util.Scanner;

public class ContinousCharacter {

	public static void main(String[] args) 
	{
		String s;
		int count=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string value from user");
		s=in.nextLine();
		for(int i=0;i<s.length()-2;i++)
		{
			if(s.charAt(i)==s.charAt(i+1)&&s.charAt(i)==s.charAt(i+2))
			{
				count++;
			}
		}
		System.out.println("the number of continous character is "+count);

	}

}
