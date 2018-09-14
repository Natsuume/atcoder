package net.kanolab.tminowa.atcoder.abc.abc091_100.abc095.d;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static long c;
	static long[][] array;
	static Set<Integer> eatedSet = new HashSet<>();
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		c = sc.nextLong();
		array = new long[n][2];
		array[0][1] = 0;
		for(int i = 0; i < n; i++) {
			array[i][0] = sc.nextLong();
			array[i][1] = sc.nextLong();
		}
		long[][] calory = new long[2][n];
		Entry<Integer, Long> rightMax = new SimpleEntry<>(0,0l);
		Entry<Integer, Long> leftMax = new SimpleEntry<>(0,0l);
		for(int i =0; i < n; i++){
			if(i == 0){
				calory[0][i] = array[0][1] - array[0][0];
				calory[1][n-1-i] = array[n-1][1] - Math.abs(c - array[n-1][0]);
			}else{
				calory[0][i] = calory[0][i-1] + array[i][1] - (array[i][0] - array[i-1][0]);
				calory[1][n-1-i] = calory[1][n-i] + array[n-1-i][1] - (array[n-i][0] - array[n-i-1][0]);
			}
			if(rightMax.getValue() < calory[0][i]) rightMax = new SimpleEntry<>(i,calory[0][i]);
			if(leftMax.getValue() < calory[1][n-1-i]) leftMax = new SimpleEntry<>(n-1-i, calory[1][n-i-1]);
		}
		long total = 0;
		if(rightMax.getValue() > leftMax.getValue()){
			for(int i = 0; i <= rightMax.getKey();i++){
				if(total < calory[0][i] + calory[1][n-1-i]) total = calory[0][i] + calory[1][n-1-i];
			}
		}else{
			for(int i = n-1; i <= rightMax.getKey();i++){
				if(total < calory[0][i] + calory[1][n-1-i]) total = calory[0][i] + calory[1][n-1-i];
			}
		}

	}
}
