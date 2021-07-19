package com.example.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: zhd
 * @Description
 * @Date: 2021/5/14 13:26
 * @Version: 1.0.0
 **/
public class SubjectProxy implements InvocationHandler {
    private Subject subject;

    public SubjectProxy(Subject subject){
        this.subject = subject;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("---------begin-----------");
        /**
         * method.invoke(subject, args); 利用反射调用类里面的实体方法
         * invoke方法的返回值，如果没有则为null
         */
        Object invoke = method.invoke(subject, args);
        System.out.println("---------end--------------");
        return invoke;
    }
}
