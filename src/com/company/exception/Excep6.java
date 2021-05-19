package com.company.exception;

public class Excep6 {
    public static void main(String args[]) {
        try {

            printThis();
            try {
                System.out.println("going to divide");
                int b = 39 / 0;
            } catch (NullPointerException e) {
                System.out.println(e);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println(e);
            }finally {
                System.out.println("finallly 1");
            }

            try {
                int a[] = new int[5];
                a[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            } finally {
                System.out.println("finally 2");
            }

            System.out.println("other statement");
        } catch (Exception e) {
            System.out.println("handeled");
        } finally {
            System.out.println("finally 3");
        }

        System.out.println("normal flow..");
    }

    private static void printThis() {

    }
}  