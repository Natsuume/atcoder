package net.kanolab.tminowa.atcoder.abc.abc088.a;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		System.out.println((n % 500) <= a ? "Yes" : "No");
	}
}
