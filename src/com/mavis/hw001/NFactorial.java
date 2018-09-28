package com.mavis.hw001;

import java.util.Scanner;

public class NFactorial {
	
	
	Scanner scanner = new Scanner(System.in);
//	int type = scanner.nextInt();
	
	public NFactorial() {
	}

	public static void main(String[] args) {
		 NFactorial nFactorial = new NFactorial();
		 nFactorial.ask();
		 nFactorial.calculator();
	}
	
	public void ask() {
		System.out.println("請輸入階層數：");
//		Scanner scanner = new Scanner(System.in);
//		int type = scanner.nextInt();
		
	}
	
	public void calculator(){
		int type = scanner.nextInt();
		int finalans = 1;
		if(type != 0) {
			for(int a = type; a >= 1 ; a--) {
				finalans = finalans * a;
			}
		}
		System.out.println(finalans);
	}
	
	
}
