package com.candidjava.time;
import java.util.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class employee
{
	public static void main(String[] arg)
	{
		String name;
		int dob,mob,by;
		float monthly_salary,annual_salary,tax_amount;
		
		Scanner str1= new Scanner(System.in);
		System.out.println("\nenter the name of employee\t");
		name= str1.nextLine();
		
		Scanner dob1= new Scanner(System.in);
		System.out.println("\nenter the birth date(dd/mm/year)\t");
		dob= dob1.nextInt(); mob= dob1.nextInt(); by= dob1.nextInt();
		
		LocalDate l = LocalDate.of(by, mob, dob); //specify year, month, date directly
		LocalDate now = LocalDate.now(); //gets localDate
		Period diff = Period.between(l, now); //difference between the dates is calculated
		
		Scanner ms= new Scanner(System.in);
		System.out.println("\nenter monthly salary of employee\t");
		monthly_salary= ms.nextFloat();
		annual_salary=(monthly_salary*12);
		
		
		System.out.println("\n\temployee name= "+name);
		System.out.println("\tage of emplyoee= " +diff.getYears() + " years  ");
		System.out.println("\temployee salary= Rs. "+monthly_salary);
		System.out.println("\temployees annual salary=" +annual_salary +" lakhs");
		
		if(annual_salary>=500000)
		{
			tax_amount=((annual_salary*20)/100);
			System.out.println("\tacording to your annual salary "+annual_salary +" you have to pay 20% tax \t tax amount= "+tax_amount);
			
		}
		
		else if(annual_salary<=400000 && annual_salary>300000 )
		{
			tax_amount=((annual_salary*15)/100);
			System.out.println("\tacording to your annual salary "+annual_salary +" you have to pay 15% tax \t tax amount= "+tax_amount);
		}
		
		else if(annual_salary<=300000 && annual_salary>200000 )
		{
			tax_amount=((annual_salary*10)/100);
			System.out.println("\tacording to your annual salary "+annual_salary +" you have to pay 10% tax \t tax amount= "+tax_amount);
		}
		else if(annual_salary==200000)
		{
			tax_amount=((annual_salary*5)/100);
			System.out.println("\tacording to your annual salary "+annual_salary +" you have to pay 5% tax  \t tax amount= "+tax_amount);
		}
		else
		{
			System.out.println("\tacording to your annual salary "+annual_salary +" you dont have to pay any tax");
		}
		
	}
}