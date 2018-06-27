package javaProgram;

public class MixString {

	public static void main(String[] args) 
	{
		String a="kaushal";
		String b="mandal";
		String temp="";
		for(int i=0;i<a.length()&&i<b.length();i++)
		{
			temp=temp+a.charAt(i)+b.charAt(i);
		}
		System.out.println(temp);

	}

}
