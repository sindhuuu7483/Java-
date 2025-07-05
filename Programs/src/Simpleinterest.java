import java.util.Scanner;
public class Simpleinterest {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principal amount");
		double a = scan.nextDouble();
		System.out.println("Enter the intrest");
		double b = scan.nextDouble();
		System.out.println("Enter the time");
		double c = scan.nextDouble();
		double res = calculateSimpleInterest(a,b,c);
		System.out.println("The simple intrest is : " +res);
	}
	public static double calculateSimpleInterest(double x , double y , double z)
	{
		double q = x * y * z;
		return q;
		
	}

}


