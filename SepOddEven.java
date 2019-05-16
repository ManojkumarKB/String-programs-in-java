package strings;

import java.util.Scanner;

public class SepOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the starting number:");
		int str=sc.nextInt();
		System.out.print("Enter the ending number:");
		int end=sc.nextInt(),c=0,ct=0;
		int l=end-str;
		int []oddArr=new int[l];
		int []evenArr=new int[l];
		for(int i=str;i<=end;i++)
		{
			if(i%2!=0)
			{
				oddArr[c++]=i;
			}
			else
			{
				evenArr[ct++]=i;
			}
		}
		System.out.print("Odd numbers is:");
		for(int i:oddArr)
		{
			if(i!=0)
				System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("Even numbers are:");
		for(int i:evenArr)
		{
			if(i!=0)
				System.out.print(i+" ");
		}
		sc.close();
	}

}
