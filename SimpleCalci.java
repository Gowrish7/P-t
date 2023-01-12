package ControlStructures;

import java.util.Scanner;
public class SimpleCalci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operator;
		double num1,num2;
		System.out.println("Enter the operator +,-,/,*");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		operator = sc.next().charAt(0); 
		System.out.println("Enter two numbers");
		num1= sc.nextDouble();
		num2= sc.nextDouble();
		double result;
		switch(operator)		
		{
		case '+' :
			result = num1+num2;
			System.out.println((int)num1 + "+" + (int)num2 + "=" +(int)result);
			break;
		case '-' :
			 result = num1-num2;
			System.out.println(num1 + "-" + num2 + "=" +(int)result);
			break;
		case '*' :
			 result = num1*num2;
			System.out.println(num1 + "*" +num2 + "=" +(int)result);
			break;
		case '/' :
			result = num1/num2;
			if(num2==0)
			{
				System.out.println("Invalid Input");
			}
			else
			System.out.println(num1 + "/" + num2 + "=" +result);
			break;
		}
	}
}
