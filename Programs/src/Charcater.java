//Question: 4 Problem: The String Joiner

//You are creating a new social networking site. 
//In one of the features, you have to combine the user's first name and last name
//to display the full name. 
//Your task is to write a static method that will concatenate two strings.

//Function:public static String joinStrings(String str1, String str2);
//Sample Input:joinStrings("Hello, ", "World!");

//Sample Output:"Hello, World!"

//Note:In the sample input, the function is given two strings: "Hello, " and "World!". 
//These two strings are concatenated to form "Hello, World!", which is the output. 
//Make sure your function works properly to display the user's 
//full name correctly on the social networking site.

import java.util.Scanner;
public class Charcater{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the charcater");
		char a = scan.next().charAt(0);
		int res = decodedCharacter(a);
		System.out.println("The decoded character is : " +res);
	}
	public static int decodedCharacter(char x)
	{
		char z = x;
		return z;
	}

}

	