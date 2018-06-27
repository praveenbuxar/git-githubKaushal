package javaProgram;

import java.util.Scanner;

public class MaxPrime {

	public static void main(String[] args) 
	{
		int n=0;
		int max=0;
		System.out.println("Enter any number from user");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int[]arr=new int[n];
		System.out.println("Enter the element in an aarray");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int j;
			for( j=2;j<arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					break;
				}
			}
			if(arr[i]==j)
			{
				if(max<arr[i])
				{
					max=arr[i];
				}

			}
		}
		System.out.println("the max prime number is"+max);

	}

}
