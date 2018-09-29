package com.mavis.hw001;

import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray {
	
	int randomnumber[] = new int[10];
	Scanner s = new Scanner(System.in);
	int findingNumber = s.nextInt();

	public TwoDimensionalArray() {
		

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
//		int randomnumber[] = new int[10];
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
		for (int x = 0; x < randomnumber.length; x++) {
			y = randomnumber[x];
			System.out.print(y + " ");
		}
	}

	public void ScannerNumber() {
//		Scanner s = new Scanner(System.in);
//		int findingNumber = s.nextInt();
	}
	
	public void Search() {
		int left = 0;
		int right = (randomnumber.length-1) ;
		while(right>=left) {
			 int middle = ((left+right)/2);
			 if(findingNumber < randomnumber[middle]) {
				 System.out.println(findingNumber + "在" + (left) + "[" + randomnumber[left] + "]及中間值" + middle + "[" + randomnumber[left] + "]，找左半邊");
				 right = middle - 1;
			 }else if (findingNumber > randomnumber[middle]) {
					System.out.println(findingNumber + "在" + (middle) + "[" + randomnumber[middle] + "]及中間值" + right + "[" + randomnumber[right] + "]，找右半邊");
					left = middle + 1;
				} else
					return;
			}
			return;
		}
	
	public void Report() {
		String keyin;
		boolean a = true;
		while (a) {
			int x=0;
			System.out.println("輸入比對值:");
			keyin = s.nextLine();
			findingNumber = Integer.parseInt(keyin);
			if(x==0) {
				System.out.println("沒有找到"+findingNumber);
				break;
			}
			else {
				System.out.println("在第" + x + "個位置找到" + findingNumber);
				break;
			}
		}
		System.out.println("資料內容:");
		for (int i = 0; i < 9; i++) {
			System.out.print(randomnumber[i]+"\t");
		}
		
	}
	
	}


