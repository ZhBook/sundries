package com.example.proxy.cglib;



import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: zhd
 * @Description
 * @Date: 2021/5/14 13:46
 * @Version: 1.0.0
 **/
public class HelloInterceptor implements MethodInterceptor {
    /**
     * invokeSuper调用被拦截的方法，不要使用invoke，会出现oom的情况
     * @param o 被代理对象的实例
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("begin time ----->"+ System.currentTimeMillis());
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("end time ------->"+System.currentTimeMillis());
        return o1;
    }
}
