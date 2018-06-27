package program;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number from user");
		n=in.nextInt();
		boolean b=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("the number is not prime");
				b=false;
				break;
				
			}
		}
			if(b==true)
			{
				System.out.println("the number is prime");
			}
		}

	}


