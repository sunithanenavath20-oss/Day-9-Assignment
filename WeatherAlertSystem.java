package com.codegnan.switchStatement;

import java.util.Scanner;

public class WeatherAlertSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int code = sc.nextInt();
		int temp = sc.nextInt();
		switch(code) {
		case 1:
			if(temp >= 20) {
				System.out.println("Sunny");
			}break;
		case 2:
			if(temp > 50) {
				System.out.println("Rainy");
			}break;
		case 3:
			if(temp <=10) {
				System.out.println("severe Warning");
			}break;
			default:
				System.out.println("invalid condition");
		}
		sc.close();

	}

}
