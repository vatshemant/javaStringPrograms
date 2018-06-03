package reversestring;

import java.util.Scanner;

public class Reverse {
	void doReverse(String s) {
		char ch[] = s.toCharArray();
		swapping(s, ch);
		printSwap(ch);
	}

	private void printSwap(char[] ch) {
		String s = new String(ch);
		System.out.println("The reverse of the given string is  " + s);
	}

	private void swapping(String s, char[] ch) {
		for (int x = 0, y = s.length() - 1; x < y; x++, y--) {
			char temp = ch[x];
			ch[x] = ch[y];
			ch[y] = temp;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A STRING");
		String str = sc.nextLine();
		Reverse rev = new Reverse();//Creating Object.
		rev.doReverse(str);
	}
}
