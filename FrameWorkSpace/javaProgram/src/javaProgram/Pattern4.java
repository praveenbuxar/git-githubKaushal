package javaProgram;

import java.util.Scanner;

public class Pattern4 
{

	public static void main(String[] args) 
	{
		int n=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number from user");
		n=in.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println("\n");
		}
	}

}
