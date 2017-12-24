package com.ln.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/24 18:08
 */
public class MyAspectXml {
    public void log() {
        System.out.println("记录日志=========");
    }

    //方法执行成功或者异常，都会执行
    public void after() {
        System.out.println("最终通知");
    }

    public void afterReturn() {
        System.out.println("后置通知");
    }

    public void exception() {
        System.out.println("异常通知");
    }

    public void around(ProceedingJoinPoint p) throws Throwable {
        System.out.println("环绕通知1");
        p.proceed();
        System.out.println("环绕通知2");
    }
}
