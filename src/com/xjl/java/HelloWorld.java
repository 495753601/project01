package com.xjl.java;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {
        /**
         *
         * @param args
         */
        public static void main(String[] args){

                System.out.print("helloworld");

                Date a1 = null;
                ArrayList b = new ArrayList();
                b.add(a1);

                try {
                        FileInputStream in = new FileInputStream("one");
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                }
        }
}