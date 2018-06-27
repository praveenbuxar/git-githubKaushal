package javaProgram;

public class MixString1 {

	public static void main(String[] args) 
	{
		String a="kaushal";
		String b="kumar";
		int c=a.length();
		int d=b.length();
		int length=0;
		String temp="";
		if(c>d)
		{
			length=c;
		}
		if(d>c)
		{
			length=d;
		}
		System.out.println("total word length is"+length);
		for(int i=0;i<length;i++)
		{
			if(i<c)
			{
				temp=temp+a.charAt(i);
			}
			if(i<d)
			{
				temp=temp+b.charAt(i);
			}
		}
		System.out.println(temp);

	}

}
