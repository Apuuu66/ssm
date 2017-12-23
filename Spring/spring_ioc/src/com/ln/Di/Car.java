package com.ln.Di;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/23 16:59
 */
public class Car {
    private String name;
    private String price;

    public Car(String name, String price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car："+this.name +" 价格："+ this.price;
    }
}
