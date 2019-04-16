package com.natsuume.atcoder.abc.abc111_120.abc118.a;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(b % a == 0 ? a+b : b-a);
	}
}
