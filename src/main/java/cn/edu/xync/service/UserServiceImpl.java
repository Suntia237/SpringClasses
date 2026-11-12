package cn.edu.xync.service;

import cn.edu.xync.mapper.UserMapper;

public class UserServiceImpl implements UserService{
    private UserMapper userMapper;
    private int connectionNum; //10

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void findAllUsers() {
        userMapper.findAllUsers();
        System.out.println("connectionNum: " + connectionNum);
    }

    @Override
    public void findUserById(int id) {
        userMapper.findUserById(id);
    }


}