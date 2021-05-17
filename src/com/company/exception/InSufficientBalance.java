package com.company.exception;

public class InSufficientBalance extends Exception {


    public void showErrorMsg(){
        System.err.println("Not sufficient balance");
    }


}
