package com.example.proxy.jdk;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @Author: zhd
 * @Description
 * @Date: 2021/5/14 13:30
 * @Version: 1.0.0
 **/
public class Main {
    @Test
    public void main() {
        SubjectImpl subject = new SubjectImpl();
        SubjectProxy subjectProxy = new SubjectProxy(subject);
        /**
         * subjectProxy.getClass().getClassLoader():代理类的类加载器
         * subject.getClass().getInterfaces():被代理类的接口，如果有多个就是数组形式传入
         * subjectProxy:代理类实例
         */
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(subjectProxy.getClass().getClassLoader(), subject.getClass().getInterfaces(), subjectProxy);
        proxyInstance.hello("world");
    }
}
