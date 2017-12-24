package com.ln.aop_annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/24 23:34
 */

//注解方式的切面类
@Aspect
//前置通知
public class MyAspectAnno {
    @Before(value = "execution(public void com.ln.aop_annotation.CustomerDaoImpl.save())")
    public void log() {
        System.out.println("记录日志");
    }
}
