package com.mavis.hw001;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {

		Random r = new Random();
		int randomnumber[] = new int[10];
		for (int i = 0; i < 10; i++) {
			randomnumber[i] = (int) r.nextInt((100) + 1);
		}

		int min, temp;
		for (int i = 0; i < randomnumber.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < randomnumber.length; j++) {
				if (randomnumber[i] < randomnumber[j]) {
					min = j;

					if (i != min) {
						temp = randomnumber[i];
						randomnumber[i] = randomnumber[min];
						randomnumber[min] = temp;
					}
				}
			}
//			temp = randomnumber[min];
//			randomnumber[min] = randomnumber[i];
//			randomnumber[i] = temp;
		}

		for (int x = 0; x < randomnumber.length; x++) {
			System.out.print(randomnumber[x] + " ");
		}
	}
}
