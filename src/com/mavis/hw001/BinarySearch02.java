package com.mavis.hw001;

import java.util.Scanner;

public interface BinarySearch02 {

	// 傳入的數序需先排序,由小至大
	// number − This is the array to be searched.
    // item − This is the value to be searched for.
	public static int BinarySearch(int[] number, int findingNumber) {
		int left = 0;
		int right = number.length;

		// 左邊的索引位置小於右邊索引的位置
		while (left <= right) {
			int mid = (left + right) / 2;
			if (number[mid] == findingNumber)
				return mid;
			else {
				if (number[mid] > findingNumber) {
					right = mid - 1;
					System.out.println("找左半邊");
				} else {
					left = mid + 1;
					System.out.println("找右半邊");
				}
			}
		}
		return -1;// 找不到時
	}

	public static void main(String args[]) {
		// 輸入物件
		Scanner s = new Scanner(System.in);

		// 二元搜尋範例
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("原始數列:");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}

		System.out.println("  ");

		System.out.println("Looking number:");
		int findingNumber = s.nextInt();

		int ans = BinarySearch(number, findingNumber);
		if (ans > -1) {
			System.out.println("找到資料!位置在:" + (ans + 1));
		} else
			System.out.println("Error! 找不到 !!");

	}
}
