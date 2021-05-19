package com.company.exception;

public class TestExceptionPropagation1 {
    void m() {
        int data = 50 / 0;

    }

    void n() {
        m();
    }

    void p() {
            n();

    }

    public static void main(String args[]) {
        TestExceptionPropagation1 obj = new TestExceptionPropagation1();
        try{
            obj.p();
        } catch (Exception e){
            System.out.println(e);
        }

        System.out.println("normal flow...");
    }
}  