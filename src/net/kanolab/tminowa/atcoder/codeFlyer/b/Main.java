package net.kanolab.tminowa.atcoder.codeFlyer.b;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		String x = sc.next();

		for(char c : x.toCharArray()){
			switch(c){
			case 'S':
				if(a > 0) a--;
				break;
			case 'C':
				if(b > 0) b--;
				break;
			case 'E':
				if(a >= b){
					if(a > 0) a--;
				}else{
					if(b > 0) b--;
				}
			}
		}
		System.out.println(a + "\n" + b);
	}
}