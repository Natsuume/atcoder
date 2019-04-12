package net.kanolab.tminowa.atcoder.abc.abc111_120.abc120.c;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int zero = 0;
		int one = 0;
		for(char c : s.toCharArray()) {
			if(c == '0')
				zero++;
			else
				one++;
		}
		System.out.println(zero+one - Math.abs(zero-one));
	}
}
