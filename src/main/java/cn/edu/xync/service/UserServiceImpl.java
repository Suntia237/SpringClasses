package cn.edu.xync.service;

import cn.edu.xync.mapper.UserMapper;

public class UserServiceImpl implements UserService{
    private UserMapper userMapper;

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
    }

    @Override
    public void findUserById(int id) {
        userMapper.findUserById(id);
    }

}