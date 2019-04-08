package com.Calculator.CalculatorApp;
import java.util.Scanner;


public class CalciMain
{
     private  int num1;
     private  int num2;
     private static int sum;
     private static int difference;
     private static int multiply;
     private static int divide;
     
     
     public CalciMain(int num1, int num2, int sum, int difference, int multiply, int divide) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.sum = sum;
		this.difference = difference;
		this.multiply = multiply;
		this.divide = divide;
	}

	public CalciMain()
     {
    	 
     }
     

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getDifference() {
		return difference;
	}

	public void setDifference(int difference) {
		this.difference = difference;
	}

	public int getMultiply() {
		return multiply;
	}

	public void setMultiply(int multiply) {
		this.multiply = multiply;
	}

	public int getDivide() {
		return divide;
	}

	public void setDivide(int divide) {
		this.divide = divide;
	}

	public static int menu()
	{
		System.out.println("***********Menu*************");
		System.out.println("1. Addition ");
		System.out.println("2. Subtraction ");
		System.out.println("3. Multiplication ");
		System.out.println("4. Division ");
		System.out.println("0. Exit ");
		System.out.println("Enter your Choice::   ");
		return sc.nextInt();
	}
	
	public static int sum(int x, int y)
	{
		sum = x + y;
		return sum;
	}
	
	public static int difference(int x, int y)
	{
		difference = x - y;
		return difference;
	}
	
	public static int multiply(int x, int y)
	{
		multiply = x * y;
		return multiply;
	}
	
	public static int divide(int x, int y)
	{
		divide = x / y;
		return divide;
	}
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{

		System.out.println("Enter the First Number::  ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number::  ");
		int num2 = sc.nextInt();
		
		int choice = 0;
		
		while((choice=menu())!=0)
		{
			switch(choice)
			{
			case 1:
				sum(num1, num2);
				System.out.println("The Addition is::  "+sum);
				break;
				
			case 2:
				difference(num1, num2);
				System.out.println("The Subtraction is::  "+difference);
				break;
				
			case 3:
				multiply(num1, num2);
				System.out.println("The Multiplication is::  "+multiply);
                break;
                
			case 4:
				divide(num1, num2);
				System.out.println("The Division is::  "+divide);
				break;
			}
		}
		
	}
	
	


}
