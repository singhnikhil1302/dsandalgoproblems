package com.arraystring.Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		String input = null;
		for (int i = 1; i <= tests; i++) {

			input = sc.next();

			printAllSubstrings(input);
		}
		sc.close();
	}

	private static void printAllSubstrings(String input) {
		// TODO Auto-generated method stub
		
		int j = 1;
		List<String> substrings = new ArrayList<String>();
		
		for (int i = 0; i < input.length(); i++) {
			
			substrings.add(input.substring(0, i+j));
		}
		
		for (int k = 0; k < substrings.size(); k++)
			System.out.println(substrings.get(k));
	}

}
