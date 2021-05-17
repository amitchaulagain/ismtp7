package com.company.exception;

import com.company.Fruit;

import java.io.FileNotFoundException;

public class ExceptionExample {


    public static void main(String[] args) throws InSufficientBalance {

        System.out.println("we are here");
        System.out.println("we are here");
        System.out.println("we are here");

        int balance = 5000;
        int inputAmount = 10000;


        int x = 0;


        try {

           // int y = 100 / 0;
            if (inputAmount > balance) {
                throw new InSufficientBalance();
            }

        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (IndexOutOfBoundsException f) {
            System.out.println(f);
        }

        System.out.println("program complete");
        System.out.println("program complete 1");
        System.out.println("program complete 2");


    }

}
