package strings;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your designation");
		String design=sc.next();
		Employee e1=new Employee(name,design);
		Allow(e1);
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("Enter your designation");
		design=sc.next();
		Employee e2=new Employee(name,design);
		Allow(e2);
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("Enter your designation");
		design=sc.next();
		Employee e3=new Employee(name,design);
		Allow(e3);
		sc.close();
	}
	static void Allow(Employee e)
	{
		if(e.design.equals("Manager"))
		{
			System.out.println("Your Bonus Amount is"+e.calcBonus(12000.25,100000.2));
		}
		else if(e.design.equals("Programmer"))
		{
			System.out.println("Your bonus Amount is"+e.calcBonus(2344.55));
		}
		else if(e.design.equals("Director"))
		{
			System.out.println("Your bonus Amount is"+e.calcBonus(200000, 500000, 1000000));
		}
	}
}
