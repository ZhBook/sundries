package com.example.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * @Author: zhd
 * @Description
 * @Date: 2021/5/14 13:53
 * @Version: 1.0.0
 **/
public class Main {
    @Test
    public void main(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CGsubject.class);
        enhancer.setCallback(new HelloInterceptor());
        CGsubject cGsubject = (CGsubject) enhancer.create();
        cGsubject.sayHello();
    }
}
