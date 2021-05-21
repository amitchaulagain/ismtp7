package com.company.multiplefilehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class MultipleFileHandlingExample{
    public static void main(String[] args) throws Exception {
        FileInputStream fs1 = null;
        FileInputStream fs2 = null;
        FileInputStream fs3 = null;
        SequenceInputStream ss = null;
        try {
            fs1 = new FileInputStream("src/com/company/multiplefilehandling/file1.txt");
            fs2 = new FileInputStream("src/com/company/multiplefilehandling/file2.txt");
            fs3 = new FileInputStream("src/com/company/multiplefilehandling/file3.txt");
            Vector<FileInputStream> v = new Vector<FileInputStream>();
            v.add(fs1);
            v.add(fs2);
            v.add(fs3);
            Enumeration<FileInputStream> e = v.elements();
            ss = new SequenceInputStream(e);
            int x;
            while ((x = ss.read()) != -1) {
                System.out.print((char) x);
            }
        } finally {
                fs1.close();
                fs2.close();
                fs3.close();
                ss.close();
        }
    }
}