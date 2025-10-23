package com.codegnan.switchStatement;

import java.util.Scanner;

public class HotelPrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Season = sc.nextInt();
		int Room = sc.nextInt();
		
		switch(Season) {
		case 1:
			if(Season == 1) {
				System.out.println(100);
			}else {
				System.out.println(80);
				
			}break;
			case  2:
			  if(Season == 1 ) {
				System.out.println(200);
				
			}else {
				System.out.println(150);
				break;
			}default:
				System.out.println("invalid input");
				
			
		}
		sc.close();

	}

}
