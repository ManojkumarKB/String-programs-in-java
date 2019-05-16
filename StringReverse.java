package strings;

import java.util.Scanner;

public class StringReverse {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next(),resStr="";
		int l=s.length();
		for(int i=l-1;i>-1;i--)
		{
			resStr=resStr+s.charAt(i);
		}
		System.out.println(resStr);
		sc.close();
	}
}
