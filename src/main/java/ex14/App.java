package ex14;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nyles Symonette
 */

import java.util.Scanner;
public class App {
    public static void main(String[] args ){
        Scanner obj = new Scanner(System.in);

        // inputs

        System.out.print("What is order amount? ");
        double amount = Double.parseDouble((obj.nextLine()));

        System.out.print("What is the state? ");
        String state = obj.nextLine();

        System.out.print("The subtotal is $"+amount);

        // state is WI then println the tav and new total

        if(state.toLowerCase().equals("wi")){

            // tax calculations
            double tax = amount * 0.055;
            System.out.print("\nThe tax is $"+tax);

            //new amount to contain tax
            amount = amount +tax;
            System.out.print("\nThe total is $"+amount);
        }

    }

}
