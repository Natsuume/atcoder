package net.kanolab.tminowa.atcoder.abc.abc071_080.abc076.c;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		int tLength = t.length();
		int sLength = s.length();
		int i = sLength - tLength;

		for(;i>=0;i--){
			int j = 0;
			for(;j < tLength;j++) if(s.charAt(i+j) != '?' && s.charAt(i+j) != t.charAt(j)) break;
			if(j < tLength){
				s = s.replaceAll("\\?", "a");
				if(i > 0) sb.append(s.substring(0, i));
				sb.append(t);
				if(i+tLength < sLength) sb.append(s.substring(i+tLength, sLength));
				break;
			}
		}
		System.out.println(i < 0 ? "UNRESTORABLE" : sb.toString());
	}
}
