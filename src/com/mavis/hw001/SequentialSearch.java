package com.mavis.hw001;

import java.util.Random;

public class SequentialSearch {

	public static void main(String[] args) {

		Random r = new Random();
		int randomnumber[] = new int[10];

		for (int h = 0; h < 10; h++) {
			randomnumber[h] = (int) r.nextInt((100) + 1);
		}
		
		for (int x = 0; x < randomnumber.length; x++) {
			System.out.print(randomnumber[x] + " ");
		}
		
	}

}
