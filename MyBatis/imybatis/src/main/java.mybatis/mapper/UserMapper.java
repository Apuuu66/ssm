package mapper;

import po.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2018/1/9 23:48
 */
public interface UserMapper {
    public User findUserById(Integer id);

    //动态代理形势中,如果返回结果集为List,那么mybatis会在生成实现类的使用会自动调用selectList方法
    public List<User> findUserByUserName(String userName);

    public void insertUser(User user);
}
