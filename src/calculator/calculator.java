package calculator;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("|Calculator|");
		Scanner read = new Scanner(System.in);
		
		double num1 = 0;
		double num2 = 0;
	    double result = 0;
		char operator = '+';
		
		System.out.print("Enter 1st number: ");
		num1 = read.nextDouble();
		
		System.out.print("Enter operator[+, -, *, /, %]: ");
		operator = read.next().charAt(0);
		
		System.out.print("Enter 2nd number: ");
		num2 = read.nextDouble();
		
		if (operator == '+') {
			result = addition(num1, num2);
		} else if (operator == '-') {
			result = subtraction(num1, num2);
		} else if(operator == '*') {
			result = multiplication(num1, num2);
		} else if(operator == '/') {
			result = division(num1, num2);
		} else if(operator == '%') {
			result = mod(num1, num2);
		} else {
			System.out.println("Error");
		}
		
		System.out.println("Answer: " + result);
		read.close();
	}
	
	public static double addition(double num1, double num2) {
		
		return num1 + num2;
	}
	
	public static double subtraction(double num1, double num2) {
		
		return num1 - num2;	
	}
	
	public static double multiplication(double num1, double num2) {
		
		return num1 * num2;	
	}
	
	public static double division(double num1, double num2) {
		
		return num1 / num2;
	}
	
	public static double mod(double num1, double num2) {
		
		return num1 % num2;
	}
}

