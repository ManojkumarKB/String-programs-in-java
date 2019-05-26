package strings;

public class Employee {
	String name="",design="";
	Employee(String name,String design)
	{
		this.name=name;
		this.design=design;
	}
	double  calcBonus(double basicAllowance)
	{
		return basicAllowance;
	}
	double calcBonus(double basicAllowance,double carAllowance)
	{
		return basicAllowance+carAllowance;
	}
	double calcBonus(double basicAllowance,double carAllowance,double houseAllowance)
	{
		return basicAllowance+carAllowance+houseAllowance;
	}
}
