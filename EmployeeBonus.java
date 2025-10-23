package com.codegnan.switchStatement;

import java.util.Scanner;


public class EmployeeBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int code = sc.nextInt();
		double salary = sc.nextDouble();
		double bonus;
		switch(code) {
		case 1:
			bonus = 0.10 * salary;
			System.out.println(bonus);
			break;
		case 2:
			bonus = 0.05 * salary;
			System.out.println(bonus);
			break;
		case 3:
			bonus = 500;
			System.out.println(bonus);
			break;
			default:
				System.out.println("Invalid Role");
			
		}
		sc.close();

	}

}
