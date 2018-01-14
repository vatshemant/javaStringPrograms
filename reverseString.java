import java.util.Scanner;
public class hemant {

    
  public static void main(String[] args)
    {
	  Scanner scanner= new Scanner(System.in);
String input;
	  char c;
	  System.out.println("Enter some String");
	  input= scanner.nextLine();
	 char reverse[]= input.toCharArray();
	 for (int i=reverse.length-1;i>=0;i--)
	 {
		 System.out.print(reverse[i]);
	 }
	  
	  
  }
    } 