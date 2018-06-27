package program;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) 
	{
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number from user");
		n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println("\n");
		}
		

	}

}
