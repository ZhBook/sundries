package com.example.vm.day01;

public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String s = new StringBuilder("ja").append("va").toString();
        System.out.println(s.intern() == s);

//        String str2 = new StringBuilder("计算机").append("软件").toString();
//        System.out.println(str2.intern() == str2);


    }
}
