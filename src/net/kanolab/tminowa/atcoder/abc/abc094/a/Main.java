package net.kanolab.tminowa.atcoder.abc.abc094.a;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		System.out.println((x >= a && x <= a+b) ? "YES" : "NO");
	}
}
