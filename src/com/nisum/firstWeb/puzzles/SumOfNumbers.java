package com.nisum.firstWeb.puzzles;

public class SumOfNumbers {

	public static void main(String[] args) {

		int[] arrayOfNumbers = { -23, -100, 80, -20, -10 };
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		int minIndex = 0;
		int maxIndex = 0;

		for (int i = 0; i < arrayOfNumbers.length; i++) {
			sum = 0;
			for (int j = i; j < arrayOfNumbers.length; j++) {
				sum = sum + arrayOfNumbers[j];
				if (sum > maxSum) {
					maxSum = sum;
					minIndex = i;
					maxIndex = j;
				}
			}
		}
		System.out.println("Maximum sum of any consecutive elements " + maxSum);
		System.out.println("From Index:" + (minIndex + 1) + " to Index:" + (maxIndex + 1));
	}

}
