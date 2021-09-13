/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex12;

import java.util.Scanner;

public class exerecise12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        float principal = input.nextFloat();
        System.out.print("Enter the rate of interest: ");
        float rate = input.nextFloat();
        System.out.print("Enter the number of years: ");
        float years = input.nextFloat();

        float interestotal = principal*(1+(rate/100)*years);

        System.out.print("After "+String.format("%.0f",years)+" years at "+rate+"%, the investment will be worth $"+String.format("%.0f",interestotal)+".");

    }
}
