package com.baeldung;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");

        for (int i=0; i < 100; i++) {
//            while (true) {
                for (int j :
                        Arrays.asList(1, 2, 3, 4)) {
                    System.out.println(j);
                }
//            }
        }
    }
}
