package strings;

import java.util.Scanner;

public class UppercaseCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println("The uppercases are");
		for(int i=0;i<s.length();i++)
		{
			int j=(int)s.charAt(i);
			if((j>=65)&&(j<=90))
			{
				System.out.println(s.charAt(i));
			}
		}
	}

}
