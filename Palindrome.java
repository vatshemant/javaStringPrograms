package palindrome;

import java.util.Scanner;

class Palindrome {

	boolean checkPalindrome(String s) {
		boolean palindrome = true;
		char ch[] = s.toCharArray();
		int x = s.length();
		if (odd(x)) {
			palindrome = oddLogic(ch, x);
		} else {
			palindrome = evenLogic(ch, x);
		}
		return palindrome;
	}

	 boolean oddLogic(char[] ch, int x) {
		boolean palindrome = true;
		int mid = x / 2;
		for (int i = 0, j = x - 1; i < mid; i++, j--) {
			if (ch[i] != ch[j]) {
				palindrome = false;
				break;
			}
		}
		return palindrome;
	}

	private boolean odd(int x) {
		return x % 2 != 0;
	}

	boolean evenLogic(char ch[], int x) {
		boolean palindrome = true;
		for (int a = 0, b = x - 1; a < b; a++, b--) {
			if (ch[a] != ch[b]) {
				palindrome = false;
				break;
			}
		}
		return palindrome;
	}

	public static void main(String args[]) {
		Palindrome ob = new Palindrome();
		Scanner s1 = new Scanner(System.in);
		String q;
		System.out.println("enter a string");
		q = s1.nextLine();
		boolean flag = ob.checkPalindrome(q);
		printResult(flag);

	}

	private static void printResult(boolean flag) {
		if (flag)
			System.out.println("This is a palindrome");
		else
			System.out.println("This is not a palindrome");
	}

}
