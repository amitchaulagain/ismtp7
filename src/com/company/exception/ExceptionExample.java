package com.company.exception;

public class ExceptionExample {


    public static void main(String[] args) throws InSufficientBalance {

        System.out.println("we are here");
        System.out.println("we are here");
        System.out.println("we are here");

        int balance = 5000;
        int inputAmount = 10000;


        int x = 0;


        try {


            throw new ArithmeticException("null value");

            // int y = 100 / 0;
//            if (inputAmount > balance) {
//                throw new InSufficientBalance("Not enough balance Exception code :100");
//            }

        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (IndexOutOfBoundsException f) {
            System.out.println(f);
        } finally {
            close();
        }

        System.out.println("program complete");
        System.out.println("program complete 1");
        System.out.println("program complete 2");


    }

    private static void close() {
        System.out.println("closing the resources ");

    }

}
