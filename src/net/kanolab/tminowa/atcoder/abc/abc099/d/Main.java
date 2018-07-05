package net.kanolab.tminowa.atcoder.abc.abc099.d;

import java.util.Arrays;
import java.util.Scanner;

//未達
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int pattern = Math.min(3, c);
		int[][]	dArray = new int[c][c];
		int[][]	cArray = new int[n][n];
		int[][] numArray = new int[pattern][c];
		for(int i = 0; i < pattern; i++) Arrays.fill(numArray[i], 0);
		for(int i = 0; i < c; i++) for(int j = 0; j < c; j++) dArray[i][j] = sc.nextInt();
		for(int i = 0; i < n; i++) for(int j = 0; j < n; j++) cArray[i][j] = sc.nextInt();
		for(int i = 0; i < n; i++) for(int j =0; j < n; j++) numArray[(i + j) % 3][cArray[i][j]-1]++;

		for(int i =0; i < numArray.length; i++) {
			int min = Integer.MAX_VALUE;
			for(int j = 0; j< numArray[i].length; j++) {
				int cost = 0;

			}
		}

	}
}
