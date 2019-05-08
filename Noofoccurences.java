package com.trials.string;
import java.util.Scanner;

public class Noofoccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next().toLowerCase();
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count=count+1;
				}	
			}
			System.out.println(s.charAt(i)+"="+count);
			count=0;
		}
	}

}
