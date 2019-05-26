package strings;

import java.util.Scanner;

public class countEachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any number of lines of paragraph");
		System.out.println("Please the enter the \"end\" in the last line");
		int sum=0;
		while(sc.hasNext())
		{
			String ch[]=sc.nextLine().split(" ");
			if(ch[0].equals("end"))
				break;
			sum=sum+ch.length;
		}
		//--sum;
		System.out.println("The total number of words are "+sum);
		sc.close();
	}
}
