package com.natsuume.atcoder.abc.abc091_100.abc095.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] m = new int[n];
		for(int i = 0; i < n; i++) {
			m[i] = sc.nextInt();
			x -= m[i];
		}
		Arrays.sort(m);
		int count = m.length + x / m[0];
		System.out.println(count);
	}
}
