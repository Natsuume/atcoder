package net.kanolab.tminowa.atcoder.abc.abc099.b;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = b - a;
		int result = 0;
		for(int i = 1; i <= n; i++ ) result+=i;
		System.out.println(result - b);
	}
}
