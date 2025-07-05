import java.util.Scanner;
public class squareNumber {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scan.nextInt();
		int res =squareNumber(a);
		System.out.println("The square of number " +res);
	}
	public static int squareNumber(int num1)
	{
		int z = num1 * num1;
		return z;
	}

}


