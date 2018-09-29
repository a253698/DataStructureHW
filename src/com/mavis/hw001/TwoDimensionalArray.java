package com.mavis.hw001;

import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray {

//		 A  *   B   =   C
//		a b    e f    ae+bg af+bh
//    	c d    g h 	  ce+dg cf+dh
//	
//      1 2    3 4    1*3+2*7 1*4+2*8
//	    5 6    7 8    5*3+6*7 5*4+6*8

	public static void main(String[] args) {
		int A[][] = { { 1, 2 }, { 5, 6 } };
		int B[][] = { { 3, 4 }, { 7, 8 } };
//		System.out.println("A matrix:");
//		print(A);
//		System.out.println("B matrix:");
//		print(B);
		System.out.println("New matrix:");
		int C[][] = Mul(A, B);
		print(C);
	}

	static int[][] Mul(int A[][], int B[][]) {
		// 先確認矩陣式是否能相乘
		for (int i = 0; i < A.length; i++) {
			if (A[i].length != B.length) {
				System.out.println("不能相乘");
				return null;
			}
		}

		// 生成A*B的矩陣
		int[][] C = new int[A.length][B[0].length];

		for (int i = 0; i < C.length; i++) {
			// 利用A的row定義新矩陣的row
			for (int j = 0; j < C[i].length; j++) {
				// 利用B的col定義新矩陣的col
				for (int k = 0; k < A[0].length; k++) {
					
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		return C;
	}

	static void print(int Matrix[][]) {
		for (int x = 0; x < Matrix.length; x++) {
			for (int y = 0; y < Matrix[x].length; y++) {
				System.out.print("  " + Matrix[x][y]);
			}
			System.out.println();
		}
	}
}
