package com.ln.log;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/23 14:59
 */

//日志用法
public class Demo {
    private Logger log=Logger.getLogger(Demo.class);
    @Test
    public void t1() {
        System.out.println("记录日志");
        log.info("执行了");
    }
}
