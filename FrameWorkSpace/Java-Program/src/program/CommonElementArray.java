package program;

import java.util.Scanner;

public class CommonElementArray {

	public static void main(String[] args) 
	{
		int n;
		int m;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of ist array");
		n=s1.nextInt();
		int[]arr=new int[n];
		System.out.println("ENter the element into ist array");
		for(int i=0;i<n;i++)
		{
			arr[i]=s1.nextInt();
		}
		
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter the size of 2nd array");
		m=s2.nextInt();
		int[]arr2=new int[m];
		System.out.println("ENter the element into 2nd array");
		for(int j=0;j<m;j++)
		{
			arr2[j]=s2.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(""+arr[j]);
					break;
				}
			}
		}
		
		

	}

}
