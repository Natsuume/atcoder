package com.natsuume.atcoder.abc.abc091_100.abc097.a;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		System.out.println((Math.abs(c-a) <= d || (Math.abs(b-a) <= d && Math.abs(c-b) <= d) )? "Yes" : "No");
	}
}
