/*Write a command line calculator program that will perform: addition, subtraction, multiplication and division.

  Sample input and output:
  Input first number: 12
  input Operator: +
  intput second number: 2
Output: The result is 12 + 2 = 14
*/

import java.util.Scanner;
import java.util.InputMismatchException;

abstract class Calculate{
	abstract double addition(double firstNumber, double secondNumber);
	abstract double subtraction(double firstNumber, double secondNumber);
	abstract double multiplication(double firstNumber, double secondNumber);
	abstract double division(double firstNumber, double secondNumber);
}

class CalculateMethods extends Calculate{
	double addition(double firstNumber, double secondNumber)
	{
		return firstNumber + secondNumber;
	}

	double subtraction(double firstNumber, double secondNumber)
	{
		return firstNumber - secondNumber;
	}

	double multiplication(double firstNumber, double secondNumber)
	{
		return firstNumber * secondNumber;
	}

	double division(double firstNumber, double secondNumber)
	{
		return firstNumber/secondNumber;
	}
}

public class Calculator{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		try
		{
			Calculate calc = new CalculateMethods();
			System.out.print("Input first number: ");
			double firstNumber = scanner.nextDouble();
			System.out.print("Input operator: ");
			String choice = scanner.next();
			System.out.print("Input second number: ");
			double secondNumber = scanner.nextDouble();

			switch(choice)
			{
				case "+":
					System.out.println("Output: The result is: "+ firstNumber + " + " + secondNumber + " = " + calc.addition(firstNumber, secondNumber));
					break;
				case "-":
					System.out.println("Output: The result is: "+ firstNumber + " - " + secondNumber + " = " + calc.subtraction(firstNumber, secondNumber));
					break;	
				case "*":
					System.out.println("Output: The result is: "+ firstNumber + " * " + secondNumber + " = " + calc.multiplication(firstNumber, secondNumber));
					break;
				case "/":
					System.out.println("Output: The result is: "+ firstNumber + " / " + secondNumber + " = " + calc.division(firstNumber, secondNumber));
					break;
				default: 
					System.out.println("Operator not available, put only +, -, *, /");
					break;
			}
		}
		catch(InputMismatchException exception)
		{
			System.out.println("Wrong input type, can't put string!!");
		}
		finally {
			scanner.close();
		}
	}
}
