package charCounter;
import java.util.Scanner;


public class Counter {
	public static int count(String x, char c) 
	{
		int num=0;
		for(int i=0;i<x.length();i++)
		{
			if(x.charAt(i) == c)
				num++;
	    }
		return num;
	}
	public static void main(String s[])
	{
		Scanner scanner= new Scanner(System.in);
		String str;
		System.out.println("Enter a String");
		str=scanner.nextLine();
		char h;
		System.out.println("Enter the character whose occurance you want to calculate");
		h=scanner.next().charAt(0);
		System.out.println("The Count is:"+ count(str,h));
	}

}
