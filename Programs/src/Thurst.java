import java.util.Scanner;
public class Thurst {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scan.nextInt();
		long res = calculateThrust(a);
		System.out.println("The result is : " +res);
	}
	public static long calculateThrust(int x)
	{
		long z = x ^ 5;
		return z;
	}

}






