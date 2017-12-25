package com.ln.transaction;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/25 22:08
 */
public class Account {
    private String name;
    private Double money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return this.name+":"+this.money;
    }
}
