package com.ln.Di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/23 17:04
 */
public class Demo {
    @Test
    public void t1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) ac.getBean("car");
        System.out.println(car.toString());
    }
    @Test
    public void t2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object flower = ac.getBean("flower");
        System.out.println(flower.toString());
    }
}
