package com.company;



/*
* Java support multi-level inheritance but not multiple inheritance
*
* */
public class Person extends Mammal {
    private String fName;
    private String lName;
    private int age;

    public String getfName() {
        return fName;
    }

    /**
     *
     * @param fName
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void delete(){
        System.out.println("Deleting Person");
    }

    Person(){
        super("apppppp");
    }

    public static void main(String[] args) {
        System.out.println("main");
    }


    public void addPerson(Person p){
        System.out.println("adding person");

    }

    public void edit(Person p){
        System.out.println("adding person");

    }



}
