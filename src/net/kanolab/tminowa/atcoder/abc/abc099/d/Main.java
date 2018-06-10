package net.kanolab.tminowa.atcoder.abc.abc099.d;

import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
	static Map<Integer, SortedMap<Integer, Integer>> costMap;
	static int color;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		color = Math.min(3, c);
		int[][]	 dArray = new int[c][c];
		int[][]	 cArray = new int[n][n];
		for(int i = 0; i < c; i++) for(int j = 0; j < c; j++) dArray[i][j] = sc.nextInt();
		for(int i = 0; i < n; i++) for(int j = 0; j < n; j++) cArray[i][j] = sc.nextInt();

	}
}
