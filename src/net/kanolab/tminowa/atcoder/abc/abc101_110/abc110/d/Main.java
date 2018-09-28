package net.kanolab.tminowa.atcoder.abc.abc101_110.abc110.d;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> l = new ArrayList<>();
		int i = 2;
		while(m > 1) {
			if(m % i == 0) {
				m /= i;
				l.add(i);
			}else {
				i++;
			}
		}
		System.out.println(l);
	}
}
