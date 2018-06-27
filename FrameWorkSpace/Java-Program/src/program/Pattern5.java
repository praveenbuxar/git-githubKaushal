package program;

import java.util.Scanner;

public class Pattern5 {

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
				int m=j%2;
				System.out.print(m);
			}
			System.out.println();
		}
				
		

	}

}
