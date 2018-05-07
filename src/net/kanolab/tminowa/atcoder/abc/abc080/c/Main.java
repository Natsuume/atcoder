package net.kanolab.tminowa.atcoder.abc.abc080.c;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] f = new String[n];
		for(int i = 0; i < 10; i++) f[i] = f[i] == null ? sc.next() : f[i] + sc.next();
		int[][] p = new int[n][10];
		for(int i = 0; i< n; i++) for(int j = 0; j < 10; j++) p[i][j] = sc.nextInt();
		
	}
}
