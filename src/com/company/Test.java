package com.company;

import java.io.FileReader;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("/Users/admin/college/ismtp7/src/com/company/application.properties");

        Properties p = new Properties();
        p.load(reader);

        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("db.password"));
    }
}