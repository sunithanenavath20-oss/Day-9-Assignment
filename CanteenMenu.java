
package com.codegnan.switchStatement;

import java.util.Scanner;

public class CanteenMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int tea_price = 10;
        final int coffee_price = 15;
        final int samosa_price = 20;
        final double tax_rate = 0.05;

        int tea_quantity = 0;
        int coffee_quantity = 0;
        int samosa_quantity = 0;

        int choice;
        do {
            System.out.println("|====================================|");
            System.out.println("|=========== CANTEEN MENU ===========|");
            System.out.println("| 1. View Menu                       |");
            System.out.println("| 2. Order Items                     |");
            System.out.println("| 3. View Bill                       |");
            System.out.println("| 4. Checkout and Exit               |");
            System.out.println("|====================================|");
            System.out.print("Enter your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("------ MENU ------");
                    System.out.println("1. Tea     - ₹10");
                    System.out.println("2. Coffee  - ₹15");
                    System.out.println("3. Samosa  - ₹20");
                    break;

                case 2:
                    System.out.print("Enter item number to order (1-3): ");
                    int item = sc.nextInt();
                    System.out.print("Enter quantity: ");
                    int qua = sc.nextInt();

                    if (qua <= 0) {
                        System.out.println("Quantity must be greater than 0.");
                        break;
                    }

                    switch (item) {
                        case 1:
                            tea_quantity += qua;
                            System.out.println(qua + " Tea(s) added.");
                            break;
                        case 2:
                            coffee_quantity += qua;
                            System.out.println(qua + " Coffee(s) added.");
                            break;
                        case 3:
                            samosa_quantity += qua;
                            System.out.println(qua + " Samosa(s) added.");
                            break;
                        default:
                            System.out.println("Enter valid item number (1–3).");
                    }
                    break;

                case 3:
                    System.out.println("--- BILL ---");
                    double subtotal = 0;

                    if (tea_quantity > 0) {
                        double teacost = tea_quantity * tea_price;
                        subtotal += teacost;
                        System.out.println("Tea x" + tea_quantity + " = " + teacost);
                    }

                    if (coffee_quantity > 0) {
                        double coffeecost = coffee_quantity * coffee_price;
                        subtotal += coffeecost;
                        System.out.println("Coffee x" + coffee_quantity + " = " + coffeecost);
                    }

                    if (samosa_quantity > 0) {
                        double samosacost = samosa_quantity * samosa_price;
                        subtotal += samosacost;
                        System.out.println("Samosa x" + samosa_quantity + " = " + samosacost);
                    }

                    if (subtotal == 0) {
                        System.out.println("No items ordered yet.");
                    } else {
                        double tax = subtotal * tax_rate;
                        double total = subtotal + tax;
                        System.out.println("Subtotal = " + subtotal);
                        System.out.println("Tax (5%) = " + tax);
                        System.out.println("Total = " + total);
                    }
                    break;

                case 4:
                    System.out.println("Thank you! Exiting system.");
                    break;

                default:
                    System.out.println("Enter a valid choice (1–4).");
            }

        } while (choice != 4);

        sc.close();
    }
}			 