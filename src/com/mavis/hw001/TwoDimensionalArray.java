package com.mavis.hw001;

import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray {

	int randomnumber[] = new int[6];
	Scanner s = new Scanner(System.in);
	int findingNumber = s.nextInt();

	TwoDimensionalArray() {

	}

	public static void main(String[] args) {
		System.out.println("Looking number:");
		TwoDimensionalArray tda = new TwoDimensionalArray();
		tda.Random();
		tda.Search();
		tda.Report();
	}

	public void Random() {
		Random r = new Random();
		for (int h = 0; h < 6; h++) {
			randomnumber[h] = (int) r.nextInt((10) + 1);
		}

		int i, j;
		int min, temp;
		for (i = 0; i < randomnumber.length; i++) {
			for (j = i + 1; j < randomnumber.length; j++)
				if (randomnumber[i] > randomnumber[j]) {
					temp = randomnumber[i];
					randomnumber[i] = randomnumber[j];
					randomnumber[j] = temp;
				}
		}

		int y = 0;
		for (int x = 0; x < randomnumber.length; x++) {
			y = randomnumber[x];
			System.out.print(y + " ");
		}
		System.out.println(" ");
	}

	public void ScannerNumber() {
//		Scanner s = new Scanner(System.in);
//		int findingNumber = s.nextInt();
	}

	public void Search(int randomnumber[], int findingNumber) {
		int left = 0;
		int right = (randomnumber.length - 1);
		int middle = ((left + right) / 2);
		while (right >= left) {
			if (findingNumber < randomnumber[middle]) {
				System.out.println("找左半邊");
				right = middle - 1;
			} else {
				if (findingNumber > randomnumber[middle]) {
					System.out.println("找右半邊");
					left = middle + 1;
				} else {
					return;
				}
			}
			return;
		}
	}

	public void Report() {
		boolean a = true;
		x = Search(randomnumber, findingNumber);
		int x = 0;
		while (a) {

			if (x == 0) {
				System.out.println("沒有找到" + findingNumber);
				break;
			} else {
				System.out.println("在第" + x + "個位置找到" + findingNumber);
				break;
			}
		}

	}

}
