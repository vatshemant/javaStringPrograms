package charFrequency;

import java.util.Scanner;

public class CharCounter {
	char[] distinct = new char[26];
	int[] frequency = new int[26];
	static int insert = 0;

	void countChar(String s) {
		char[] ch = s.toCharArray();
		calculate(s, ch);
		printFrequency();
	}

	private void calculate(String s, char[] ch) {
		int count;
		boolean isDistinct;
		for (int i = 0; i < s.length(); i++) {
			count = 0;
			isDistinct = checkDistinct(ch[i]);
			if (!isDistinct) {
				distinct[insert] = ch[i];
				frequency[insert] = getCount(s, ch, count, i);
				insert++;
			}
		}
		
	}

	private int getCount(String s, char[] ch, int count, int i) {
		for (int j = i; j < s.length(); j++) {
			if (ch[i] == ch[j]) {
				count++;
			}
		}
		return count;
	}

	private void printFrequency() {
		for (int j = 0, k = 0; j < insert && k < insert; j++, k++) {
			System.out.println(distinct[j] + " has occured " + frequency[k] + " times");
		}
	}

	private boolean checkDistinct(char c) {
		for (int x = 0; x < distinct.length; x++) {
			if (distinct[x] == c) {
				return true;
			}
		}
		return false;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String st = sc.nextLine();
		CharCounter ob = new CharCounter();
		ob.countChar(st);
	}
}
