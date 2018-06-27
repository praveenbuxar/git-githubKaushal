package program;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) 
	{
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("ENter a number from user");
		n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
