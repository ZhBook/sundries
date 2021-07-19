package com.example.proxy.jdk;

/**
 * @Author: zhd
 * @Description
 * @Date: 2021/5/14 13:26
 * @Version: 1.0.0
 **/
public class SubjectImpl implements Subject{
    public void hello(String param) {
        System.out.println("hello " +param);
    }
}
