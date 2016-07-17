package com.nisum.firstWeb.puzzles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int maxDistance = -1;
		int n = in.nextInt();

		Integer A[] = new Integer[n];
		for (int A_i = 0; A_i < n; A_i++) {
			A[A_i] = in.nextInt();
		}

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(A));

		for (int counter = 0; counter < n; counter++) {
			int firstElement = list.get(counter);
			int distance = list.lastIndexOf(firstElement) - counter;
			if (distance != 0 && distance > maxDistance) {
				maxDistance = distance;
			}
		}
		System.out.println(maxDistance);
	}
}