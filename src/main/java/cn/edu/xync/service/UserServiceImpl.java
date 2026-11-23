package cn.edu.xync.service;

import cn.edu.xync.mapper.UserMapper;
import cn.edu.xync.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: GeMeng
 * @Date: 2026/10/26 14:57
 */
//@Component
@Service
@Scope("prototype")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Value("10")
    private int connectionNum; //10

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserServiceImpl(UserMapper userMapper, int connectionNum) {
        this.userMapper = userMapper;
        this.connectionNum = connectionNum;
    }

    @Override
    public List<User> findAllUsers() {
        List<User> users = userMapper.findAllUsers();
        for (User user : users)
            System.out.println(user);
        return users;
    }

    @Override
    public User findUserById(int id) {
        User user = userMapper.findUserById(id);
        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println("User not found with id: " + id);
        }
        return user;
    }

    @Override
    public void findAllOrders() {
        userMapper.
    }

    @Override
    public void findAllOrdersWithUser() {

    }
}
