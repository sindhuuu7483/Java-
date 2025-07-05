
import java.util.Scanner;
public class Halve {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		double a = scan.nextDouble();
		double res = halveTheNumber(a);
		System.out.println("The half of the number is : " +res);
	}
	public static double halveTheNumber(double x)
	{
		double z = x/2;
		return z;
	}

}

