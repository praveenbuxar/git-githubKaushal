package javaProgram;

public class RemoveSpace 
{
	public static void main(String[] args) 
	{
		String s="kaushal kumar mandal";
		int len=s.length();
		String str="";
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)!=' ')
			{
				str=str+s.charAt(i);
			}
			System.out.print(str);
			str="";
		}
	}

}
