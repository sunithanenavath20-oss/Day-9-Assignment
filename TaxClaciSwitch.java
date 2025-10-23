package com.codegnan.switchStatement;

import java.util.Scanner;


public class TaxClaciSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int code = sc.nextInt();
		double income = sc.nextDouble();
		switch(code) {
		case 1:
		  double North = income *0.05;
		  System.out.println(North);
		break;
		case 2:
			double South = income * 0.06;
			System.out.println(South);
			break;
		case 3:
			double east = income * 0.07;
			System.out.println(east);
			break;
		case 4:
			double West = income * 0.08;
			System.out.println(West);
			break;
		default :
			System.out.println("invalid Region");
			}sc.close();
	}

}
