import java.util.Scanner;
public class FeetToinches {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the feet");
		double a = scan.nextDouble();
		double res = convertInchesToFeet(a);
		System.out.println("The converted feet to inches is : " +res);
		
	}
	public static double convertInchesToFeet(double x)
	{
		double z = x*12;
		return z;
	}

}



