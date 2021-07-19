package com.example.test;

import java.util.ArrayList;

/**
 * @Author: zhd
 * @Description
 * @Date: 2021/5/21 16:42
 * @Version: 1.0.0
 **/
public class test {

    public static void main(String args[]) {

        long start = System.currentTimeMillis();
        ArrayList<ArrayList<String>> arrayLists = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < 1000000; i++) {
            ArrayList<String> strings = new ArrayList<String>();
            for(int x=0;x<20;x++){
                strings.add("这是第"+i+"个元素");
            }
            arrayLists.add(strings);
        }
        long after = System.currentTimeMillis();
        System.out.println("arrayList总共花费的时间为："+(after-start));

        long start2 = System.currentTimeMillis();
        ArrayList<String[]> list = new ArrayList<String[]>();

        for (int i = 0; i < 1000000; i++) {
            String[] str = new String[20];
            for(int x=0;x<20;x++){
                str[x] = "这是第"+i+"个元素";
            }
            list.add(str);
        }
        long after2 = System.currentTimeMillis();
        System.out.println("String总共花费的时间为："+(after2-start2));

    }



}
