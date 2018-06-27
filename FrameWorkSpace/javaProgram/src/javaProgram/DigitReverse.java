package javaProgram;

public class DigitReverse {

	public static void main(String[] args) 
	{
		int b=0;
		int c=0;
		int a=2596;
		while(a>0)
		{
			b=a%10;
			c=c*10+b;
			a=a/10;
		}
		System.out.println(c);

	}

}
