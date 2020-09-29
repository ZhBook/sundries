package com.example.string.day01;

public class StringBuilderTest {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder();
        str.append(",a");
        str.append(",b");
        str.append(",c");
        str.append(",d");
        System.out.println(str.substring(1));
    }
}
