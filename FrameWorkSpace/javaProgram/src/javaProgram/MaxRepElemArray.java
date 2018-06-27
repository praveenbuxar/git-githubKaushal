package javaProgram;

import java.util.Scanner;

public class MaxRepElemArray {

	public static void main(String[] args) 
	{
		int n;
		int count=0;
		int count1=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		n=in.nextInt();
		int[]arr=new int[n];
		System.out.println("Enter the element in an array");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				if(count1<count)
				{
					count1=count;
					n=arr[i];
				}
			}
		}
		System.out.println("the max element is"+n);

	}

}
