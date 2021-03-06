package com.natsuume.atcoder.abc.abc081_090.abc082.c;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++){
			int x = sc.nextInt();
			map.put(x, map.containsKey(x) ? map.get(x)+1 : 1);
		}
		int sum = 0;
		for(Entry<Integer, Integer> entry : map.entrySet()){
			if(entry.getKey() > entry.getValue()) sum+=entry.getValue();
			else if(entry.getKey() < entry.getValue()) sum += entry.getValue() - entry.getKey();
		}
		System.out.println(sum);
	}
}
