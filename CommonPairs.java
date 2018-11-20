package com.arraystring.Examples;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class CommonPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		int size = 0;
		int sum = 0;

		for (int i = 0; i < tests; i++) {
			size = sc.nextInt();
			int inputData[] = new int[size];

			for (int j = 0; j < inputData.length; j++) {
				inputData[j] = sc.nextInt();
			}

			sum = sc.nextInt();
			findPairsEqToSum(inputData, sum);

			sum = 0;

		}

		sc.close();
	}

	private static void findPairsEqToSum(int[] inputData, int sum) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		TreeMap<Integer, String> output = new TreeMap<Integer, String>();
		for (int num : inputData) {
			if (set.contains(sum - num)) {
				String s = (sum - num) + " " + num + " " + sum;
				output.put(sum - num, s);
			}
			set.add(num);
		}

		for (Integer ele : output.keySet())
			System.out.println(output.get(ele));

		if (output.size() == 0)
			System.out.println("-1");

		// return null;
	}

}
