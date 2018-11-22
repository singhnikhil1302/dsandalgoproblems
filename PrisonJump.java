package com.coding.problems;

import java.util.Scanner;

public class PrisonJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int distanceForward = sc.nextInt();
		int distanceBackward = sc.nextInt();
		int noOfWalls = sc.nextInt();
		int heightOfWalls[] = new int[noOfWalls];
		for (int i = 0; i < noOfWalls; i++) {
			heightOfWalls[i] = sc.nextInt();
		}

		int jumpsRequired = getJumpCount(distanceForward, distanceBackward, heightOfWalls);
		System.out.println(jumpsRequired);
		sc.close();

	}

	private static int getJumpCount(int distanceForward, int distanceBackward, int[] heightOfWalls) {
		// TODO Auto-generated method stub
		int distanceRem = 0;
		int jump = 0;
		for (int i = 0; i < heightOfWalls.length; i++) {

			jump += heightOfWalls[i] / distanceForward;
			distanceRem = (heightOfWalls[i] % distanceForward)
					+ (heightOfWalls[i] / distanceForward) * distanceBackward;

			if (distanceRem <= distanceForward)
				jump++;
			else {
				jump += distanceRem / distanceForward;

				distanceRem = (distanceRem % distanceForward) + distanceBackward;
				if (distanceRem <= distanceForward)
					jump++;

			}
			distanceRem = 0;
		}

		return jump;
	}

}
