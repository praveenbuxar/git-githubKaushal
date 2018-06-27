package javaProgram;

import java.util.Scanner;

public class MaxArray {

	public static void main(String[] args) 
	{
		int n=0;
		int max=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the range of an array");
		n=in.nextInt();
		int[]arr=new int[n];
		System.out.println("Enter the element in an array");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("the largest number in an array is"+max);
		

	}

}
