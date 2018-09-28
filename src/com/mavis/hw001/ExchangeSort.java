package com.mavis.hw001;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExchangeSort {

	public static void main(String[] args) {

		Random r = new Random();
		int randomnumber[] = new int[10];

		for (int h = 0; h < 10; h++) {
			randomnumber[h] = (int) r.nextInt((100) + 1);
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
		for(int x = 0 ; x < randomnumber.length; x++) {
			 y = randomnumber[x];
			 System.out.print( y + " ");
		}
	}
}
