package javaProgram;

public class ReverseWordByWord {

	public static void main(String[] args) 
	{
		String s="this is India";
		String temp="";
		String str="";
		int len=s.length()-1;
		for(int i=0;i<len;i++)
		{
			temp=temp+s.charAt(i);
			if((s.charAt(i)==' ')||(i==len-1))
			{
				for(int j=temp.length()-1;j>0;j--)
				{
					str=str+temp.charAt(j);
					if((j==0)&&(i!=len))
					{
						str=str+"";
					}
				}
			}
			temp="";
		}
		System.out.println(str);

	}

}
