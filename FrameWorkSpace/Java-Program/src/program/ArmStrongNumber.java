package program;

import java.util.Scanner;

public class ArmStrongNumber 
{
	public static void main(String[] args) 
	{
		int n,sum=0,temp,r;
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number from user");
		n=in.nextInt();
		temp=n;
		while(temp!=0)
		{
			r=temp%10;
			sum=sum+r*r*r;
			temp=temp/10;
		}
		if(n==sum)
		{
			System.out.println("the number is armstrong " +n);
		}
		else
		{
			System.out.println("the number is not armstrong " +n);
		}
	}

}
