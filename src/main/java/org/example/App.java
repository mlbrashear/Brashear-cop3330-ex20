package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

//amount = Math.round(amount*100.0)/100.0;

class Main {
    public static void main(String[] args) {
        //declare variables
        double amount, tax = 0, total;
        String state, county;
        Scanner sc = new Scanner(System.in);

        //scan user input
        System.out.println("What is the order amount?");
        amount = sc.nextInt();
        System.out.println("What state do you live in?");
        state = sc.next();

        //determine tax based on their state and county
        if(state.equals("Wisconsin")) {
            System.out.println("What county do you live in?");
            county = sc.next();
            if(county.equals("Dunn")) {
                tax = amount * 0.055;
            }
            else if(county.equals("Eau Claire")) {
                tax = amount * 0.054;
            }
            else {
                tax = amount * 0.05;
            }
        }
        else if(state.equals("Illinois"))
            tax = amount * 0.08;

        //calculate and round tax
        tax = Math.round(tax*100.0)/100.0;
        amount = Math.round(amount*100.0)/100.0;
        total = tax + amount;

        //print out findings
        System.out.println("The tax is $" + tax + "." + "\nThe total is $" + total + ".");

        sc.close();
    }
}