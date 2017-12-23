package com.ln.Di;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/23 17:13
 */
public class Flower {
    private String [] category;
    private List list;
    private Map map;
    private Properties properties;

    public void setCategory(String[] category) {
        this.category = category;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return Arrays.toString(category)+"  "+ list.toString()+"  "+map.toString()+" "+properties.toString() ;
    }
}
