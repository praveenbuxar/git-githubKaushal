package javaProgram;

import java.util.Scanner;

public class Pattern3 
{

	public static void main(String[] args) 
	{
		int n=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number from user");
		n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("\n");
		}
	}

}
