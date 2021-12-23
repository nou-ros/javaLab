/* Write a program that will print total count of the odd and even
numbers between two inserted integer and print all the even numbers.
*/

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class OddEvenCount {
	int startNumber;
	int endNumber;
	
	OddEvenCount()
	{
		this.startNumber = 0;
		this.endNumber = 0;
	}
	
	void validateNumbers(int startNumber, int endNumber)
	{
		if(startNumber < 0 || endNumber < 0)
		{
			System.out.println("Starting or ending number can not be negative");
		}
		else if(startNumber > endNumber)
		{
			System.out.println("Starting number should not be greater than limit!!!");
		}
	}
	
	void countOddEvent(int startNumber, int endNumber)
	{
		int totalEven = 0;
		int totalOdd = 0;
		
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		
		for(int i=startNumber; i<=endNumber; i++)
		{
			if(i%2 == 0)
			{
				totalEven++;
				evenNumbers.add(i);
			}
			else if(i%2 != 0)
			{
				totalOdd++;
			}
		}
		
		System.out.println("Total even number count: " + totalEven);
		System.out.println("Total odd number count: " + totalOdd);
		System.out.println("The even numbers between " + startNumber + " and " + endNumber + " are: ");
		
		if(evenNumbers.size() == 0)
		{
			System.out.println(0);
		}
		else
		{
			for(int i=0; i < evenNumbers.size(); i++)
			{
				if(i < evenNumbers.size() -1)
				{
					System.out.println(evenNumbers.get(i) + ", ");
				}
				else
				{
					System.out.println(evenNumbers.get(i));
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		OddEvenCount oddEvenCount = new OddEvenCount();
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Enter starting number and ending number bellow: ");
			System.out.print("Enter starting number: ");
			int startNumber = scan.nextInt();
			System.out.print("Enter ending number: ");
			int endNumber = scan.nextInt();
			oddEvenCount.validateNumbers(startNumber, endNumber);
			oddEvenCount.countOddEvent(startNumber, endNumber);
		}catch(InputMismatchException exception)
		{
			System.out.println("Sorry! Input can only be an integer value.");
		}finally {
			scan.close();
		}
	}
}


