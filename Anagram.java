package com.trials.sample;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String s=sc.next();
		s=s.toLowerCase();
		System.out.println("Enter the string to find the anagram");
		String k=sc.next();
		k=k.toLowerCase();
		int count=0;
		String sk="";
		if(s.length()==k.length())
		{
			for(int i=0;i<s.length();i++)
			{
				for(int j=0;j<k.length();j++)
				{
					if(sk.contains(s.charAt(i)+"")==false)
					{
					if(s.charAt(i)==k.charAt(j))
					{
						sk=sk+s.charAt(i);
						count=count+1;
					}
					}
				}
					sk="";
			}
			System.out.println(count);
			if(count==s.length())
				System.out.println("Its a anagram");
			else
			System.out.println("Its not a anagram");
		}
		else
		{
			System.out.println("Its not a anagram");
		}
	sc.close();
	}
}
