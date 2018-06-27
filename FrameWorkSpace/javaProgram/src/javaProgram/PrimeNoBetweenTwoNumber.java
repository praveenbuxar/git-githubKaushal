package javaProgram;

import java.util.Scanner;

public class PrimeNoBetweenTwoNumber {

	public static void main(String[] args) 
	{
		int num1,num2;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter ist number from user");
		num1=in.nextInt();
		System.out.println("ENter 2nd number from user");
		num2=in.nextInt();
		for(int i=num1;i<num2;i++)
		{
			int j;
			for( j=2;j<i;j++)
			{
				if(i%j==0)
				{
					break;
				}
			}
			if(i==j)
			{
				System.out.println(" "+i);
			}
		}
		

	}

}
