import java.util.Scanner;
public class MinuteTohours {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the minute");
		int a = scan.nextInt();
		double res = convertToHours(a);
		System.out.println("The converted minutes to hours is : " +res);
		
	}
	public static double convertToHours(int x)
	{
		double z = x/60;
		return z;
	}

}

