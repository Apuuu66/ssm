package com.ln.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/23 19:32
 */

@Component(value = "userService")
//@Scope(value = "singleton")
public class UserServiceImpl implements UserService {

    //注入普通变量  set方法可以不写 配置文件方式必须写set方法
    @Value(value = "qiqi")
    private String name;

    //注入对象
//    @Autowired //按类型自动装配

    @Autowired  //按名称装配  推荐
    @Qualifier(value = "userDao")

//    @Resource(name = "userDao")  //java中的注解装配
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("userService  保存------" + name);
        userDao.save();
    }

    @PostConstruct  //初始化执行
    public void init() {
        System.out.println("初始化");
    }
}
