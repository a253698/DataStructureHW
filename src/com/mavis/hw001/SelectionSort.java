package com.mavis.hw001;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {

		Random r = new Random();
		List<Integer> randomnumber = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			randomnumber.add(r.nextInt((50) + 1));
		}

		int i, j;
		int min, temp;
		int rightnumber = randomnumber.get(i);
		for (i = 0; i < randomnumber.size(); i++) {
			min = i;
			for (j = i + 1; j < randomnumber.size(); j++)
				if (randomnumber.get(j) < randomnumber.get(min)) {
					min = j;
					temp = randomnumber.get(i);
					rightnumber = randomnumber.get(min);
					randomnumber.get(min) = temp;
				}
		}
		System.out.print(randomnumber);
	}

}
