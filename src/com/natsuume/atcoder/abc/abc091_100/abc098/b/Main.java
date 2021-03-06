package com.natsuume.atcoder.abc.abc091_100.abc098.b;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
		int max = 0;
		for(int i = 1; i < n; i++) {
			int count = 0;
			for(char c = 'a'; c <= 'z'; c++)
				if(s.substring(0, i).contains(String.valueOf(c)) && s.substring(i).contains(String.valueOf(c)))
					count++;
			if(max < count)
				max = count;
		}
		System.out.println(max);
	}
}
