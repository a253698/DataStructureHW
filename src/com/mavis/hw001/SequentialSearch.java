package com.mavis.hw001;

import java.util.Random;
import java.util.Scanner;

public class SequentialSearch {

	public static void main(String[] args) {

		Random r = new Random();
		int randomnumber[] = new int[10];
		for (int h = 0; h < 10; h++) {
			randomnumber[h] = (int) r.nextInt((100) + 1);
		}
		
		System.out.print("Number you are searching：");
		Scanner scanner = new Scanner(System.in);
		int searchingnumber = scanner.nextInt();
		
		
		int position = 0;
		for (int i = 0; i < randomnumber.length; i++) {
			if (searchingnumber == i) {
				boolean correct = true;
				position = i;
				break;
			}
		}
		


		
		
		for (int x = 0; x < randomnumber.length; x++) {
			System.out.print(randomnumber[x] + " ");
		}
		
		
		
	}

}
