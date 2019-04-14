package com.natsuume.atcoder.abc.abc081_090.abc088.d;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	static int[][] lengthGrid;
	static int[][] grid;
	static int h;
	static int w;

	static List<Entry<Integer,Integer>> pairList = new ArrayList<>();

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split(" ");
		h = Integer.parseInt(s[0]);
		w = Integer.parseInt(s[1]);
		grid = new int[h][w];
		lengthGrid = new int[h][w];
		for(int i = 0;i < h;i++){
			char[] array = sc.nextLine().toCharArray();
			for(int j =0;j<w;j++){
				grid[i][j] = array[j] == '.' ? 1 : 0;
				lengthGrid[i][j] = -1;
			}
		}
		searchRoute(0,0,0);
		if(lengthGrid[h-1][w-1] == -1){
			System.out.println(-1);
			return;
		}
		paintRoute(h-1,w-1, lengthGrid[h-1][w-1]);
		int score = 0;
		for(int i = 0;i < h;i++){
			for(int j = 0; j < w;j++){
				score += grid[i][j];
			}
		}
		System.out.println(score-1);
	}

	public static void paintRoute(int i, int j, int length){
		if(i == 0 && j == 0) return;
		grid[i][j] = 0;
		length--;
		if(i != h-1 && lengthGrid[i+1][j] == length) paintRoute(i+1,j,length);
		else if(j != w-1 && lengthGrid[i][j+1] == length) paintRoute(i,j+1,length);
		else{
			if(i > 0 && lengthGrid[i-1][j] == length) paintRoute(i-1,j,length);
			else if(j > 0)paintRoute(i,j-1,length);
		}
	}

	public static void searchRoute(int i, int j, int length){
		if(i == h || j == w) return;
		if(lengthGrid[i][j] != -1 && lengthGrid[i][j] <= length) return;
		if(grid[i][j] == 0) return;
		lengthGrid[i][j] = length;
		if(i == h-1 && j == w-1) return;
		length++;
		if(i != 0) searchRoute(i-1,j,length);
		if(j != 0) searchRoute(i,j-1,length);
		searchRoute(i+1,j,length);
		searchRoute(i,j+1,length);
	}
}
