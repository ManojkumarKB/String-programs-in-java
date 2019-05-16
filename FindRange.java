package strings;

import java.util.Scanner;

public class FindRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the Array");
		int n=sc.nextInt(),arr[]=new int[n];
		System.out.println("Enter the numbers:");
		int min;
		int max=min=arr[0]=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			arr[i]=sc.nextInt();
			if(min>arr[i])
				min=arr[i];
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("Largest element is:"+max);
		System.out.println("Smallest element is:"+min);
		sc.close();
	}

}
