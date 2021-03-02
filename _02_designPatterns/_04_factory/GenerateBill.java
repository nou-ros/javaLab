import java.io.*;   
import java.util.Scanner;

public class GenerateBill
{  
    public static void main(String args[])throws IOException
	{  
      GetPlanFactory planFactory = new GetPlanFactory();  
      Scanner scan = new Scanner(System.in);
	  
      System.out.print("Enter the name of plan for which the bill will be generated: ");  
	  String planName = scan.nextLine();

	  
      System.out.print("Enter the number of units for bill will be calculated: ");  
	  int units = scan.nextInt();
  
      Plan p = planFactory.getPlan(planName);  
      //call getRate() method and calculateBill()method of DomesticPaln.  
  
       System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
           p.getRate();  
           p.calculateBill(units);  
       }  
 }//end of GenerateBill class.  