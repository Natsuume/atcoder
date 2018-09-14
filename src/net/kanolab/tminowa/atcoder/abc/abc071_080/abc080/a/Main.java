package net.kanolab.tminowa.atcoder.abc.abc071_080.abc080.a;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(Math.min(a * n, b));
	}
}
