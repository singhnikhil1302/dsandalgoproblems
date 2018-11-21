package com.arraystring.Examples;

import java.util.List;
import java.util.Scanner;

public class LongestCommonPrefix {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		int lengthOfInput = 0;
		String input[] = null;
		for (int i = 1; i <= tests; i++) {

			lengthOfInput = sc.nextInt();
			input = new String[lengthOfInput];
			for (int j = 0; j < lengthOfInput; j++) {
				input[j] = sc.next();
			}

			if (input.length == 1)
				System.out.println(input[0]);
			else {
				getLongestPrefix(input);
			}

		}
		sc.close();
	}

	private static void getLongestPrefix(String[] input) {

		String longestPrefix = input[0];
		for (int i = 1; i < input.length; i++) {

			longestPrefix = getLongestPrefix(longestPrefix, input[i]);
		}

		if (null == longestPrefix || longestPrefix.isEmpty())
			System.out.println("-1");
		else
			System.out.println(longestPrefix);

	}

	private static String getLongestPrefix(String longestPrefix, String string) {
		// TODO Auto-generated method stub
		int index = 0;
		int calcLength = longestPrefix.length() < string.length() ? longestPrefix.length() : string.length();
		for (int i = 0; i < calcLength; i++) {

			if (string.charAt(i) == longestPrefix.charAt(i))
				index++;
		}
		return longestPrefix.substring(0, index);
	}


}
