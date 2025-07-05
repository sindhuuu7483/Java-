import java.util.Scanner;

public class JourneyCalculatorApp2 
{
	public static void main (String []args)
	  {
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter the number a");
		  double a = scan.nextDouble();
		  System.out.println("Enter the number b");
		  double b = scan.nextDouble();
		  JourneyCalculator j1 = new JourneyCalculator(60,1.5);
		  double res = j1.calculateDistance(a,b);
		  System.out.println("The distance Travelled is" +res);
	  }
}


