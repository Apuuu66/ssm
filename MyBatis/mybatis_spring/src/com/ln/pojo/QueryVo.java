package com.ln.pojo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Twinkle
 * Time: 2018/1/20 19:34
 */
public class QueryVo {
    private User user;
    private List<Integer> list;

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
