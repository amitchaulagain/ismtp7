package com.company.exception;

public class InSufficientBalance extends Exception {


    InSufficientBalance(String msg){
       super(msg);
    }


    public void showErrorMsg(){
        System.err.println("Not sufficient balance");
    }


}
