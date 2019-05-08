package com.trials.string;
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
		for(int i=0;i<k.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(k.charAt(i)==s.charAt(j))
				{
					count=count+1;
				}
			}
		}
		if(count==s.length())
			System.out.println("Its a anagram");
		else
			System.out.println("Its not a anagram");
		
	}

}
