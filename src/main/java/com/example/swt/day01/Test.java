package com.example.swt.day01;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        while (true) {
            for (int i = 0; i < 40; i++) {
                int nextInt = new Random().nextInt(10);
                System.out.print(nextInt + "  ");
            }
            try {
                Thread.sleep(120);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\n");
        }
    }
}
