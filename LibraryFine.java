package com.codegnan.switchStatement;

import java.util.Scanner;


public class LibraryFine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int code = sc.nextInt();
		int days = sc.nextInt();
		int fine;
		switch(code) {
		case 1:
		if(days >=1 && days <= 5) {
		fine = days *1;
		System.out.println(fine);
		}break;
		case 2: 
		if(days >= 6 && days <= 10) {
		fine = (days * 2);
		System.out.println(fine);
		}break;
		case 3:
		if(days > 10 ) {
		fine = (days * 5);
	    System.out.println(fine);
	    break;
		}default:
		System.out.println("invalid statement ");
		}
		
		  
		
		sc.close();
		

	}

}
