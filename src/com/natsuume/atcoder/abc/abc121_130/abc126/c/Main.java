package com.natsuume.atcoder.abc.abc121_130.abc126.c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner();
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		list.add(n);
		for(double d = k; 1 <= d; d/=2) 
			list.add((int)d);
		list.add(0);
		Collections.reverse(list);
		System.out.println(list);
		double sum = 0;
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i-1) > n)
				break;
			
			double base = (Math.min(n, list.get(i)) - list.get(i-1)) / (double)n;
			double d = base * Math.pow(0.5, list.size() - i -1);
			sum += d;
			System.out.println();
			System.out.println("i = " + i + ", list.get(i) = " + list.get(i));
			System.out.println("base = " + base + ", d = " + d +" , pow(0.5, " + (list.size()-i -1) + ")");
		}
		System.out.println(sum);
	}
}

class Scanner {
	private static final int SPACE = (int)' ';
	private static final int LINE_END_0 = 13;
	private static final int LINE_END_1 = 10;
	private static final int BEFORE = -1;
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public String next(){
		StringBuilder sb = new StringBuilder();
		
		int length = BEFORE;
		readLoop: while(true) {
			try {
				int value = br.read();
				switch(value) {
				case LINE_END_1:
					if(length == BEFORE)
						break;
					
					if((int)sb.charAt(length) == LINE_END_0)
						sb.deleteCharAt(length);
				case SPACE:
					break readLoop;
				}
				sb.append((char)value);
				length++;

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sb.toString();
	}
	
	public String[] nextArray(int length) {
		String[] array = new String[length];
		for(int i = 0; i < length; i++)
			array[i] = next();
		return array;
	}
	
	public double nextDouble() {
		return Double.parseDouble(next());
	}
	
	public double[] nextDoubleArray(int length) {
		double[] array = new double[length];
		for(int i = 0; i < length; i++)
			array[i] = nextDouble();
		return array;
	}
	
	public int nextInt() {
		return Integer.parseInt(next());
	}
	
	public int[] nextIntArray(int length) {
		int[] array = new int[length];
		for(int i = 0; i < length; i++)
			array[i] = nextInt();
		return array;
	}
	
	public long nextLong() {
		return Long.parseLong(next());
	}
	
	public long[] nextLongArray(int length) {
		long[] array = new long[length];
		for(int i = 0; i < length; i++)
			array[i] = nextLong();
		return array;
	}
	
	public boolean ready() {
		try {
			return br.ready();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
