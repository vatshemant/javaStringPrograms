package space;
import java.util.Scanner;

public class space {
public static void main(String s[]) {
	Scanner scanner= new Scanner(System.in);
	String str;
	System.out.println("Enter a String");
	str= scanner.nextLine();
	System.out.println("The Original String is::"+str);
	System.out.println("The edited string is  ::"+ str.trim() );//trim() function to remove leading and trailing spaces 
	
	str= str.trim();
	String x= str.replaceAll(" ","%");
	System.out.println("Replacing blanks with %::  "+x);
	
}
}
