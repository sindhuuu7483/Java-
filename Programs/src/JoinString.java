import java.util.Scanner;
public class JoinString {
		public static void main(String []args)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the first name");
			String a = scan.nextLine();
			System.out.println("Enter the second number");
			String b = scan.nextLine();
			String res = joinstring(a,b);
			System.out.println("The combination of first name and second name is : " +res);
		}
		public static String joinstring(String str1, String str2)
		{
			String z = str1 + str2;
			return z;
	
	}
}






