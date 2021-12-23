/* Write a program that will print the following pattern?
*
**
****
**
*
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class PrintPattern{
	
	static int logic(int size, int k, int i, boolean even)
	{
		if(even)
		{
			if(i <= size/2)
			{
				k=i;
			}else if(i== ((size / 2) + 1)) {
				k = i - 1;
			}else {
				k = size - i + 1;
			}
		}
		else
		{
			if(i <= ((size / 2) + 1)) {
				k = i;
			}else {
				k = size - i + 1;
			}
		}
		return k;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("Enter size: ");
			int size = scan.nextInt();
			boolean even = false;
			int k = 0;
			if(size % 2 == 0) {
				even = true;
			}
			for(int i = 1; i <= size; i++) {
				k = PrintPattern.logic(size, k, i, even);
				for(int j = 1; j <= k; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}catch(InputMismatchException exception) {
			System.out.println("Sorry! Input can only be an integer value.");
		}finally {
			scan.close();
		}
	}
}
