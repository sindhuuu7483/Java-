import java.util.Scanner;
public class Lenght {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = scan.nextInt();
		System.out.println("Enter the second number");
		double b = scan.nextDouble();
		int res1 = calculatePlotArea(a);
		double res2 =  calculatePlotArea(b);
		System.out.println("The side lenght is  : " +res1);


		
		System.out.println("The side lenght is : " +res2);
	}
	public static int calculatePlotArea(int x)
	{
		int s = x*x;
		return s;
	}
	public static double calculatePlotArea(double y)
	{
		double q = y*y;
		return q;
	}

}





