package cn.edu.xync.service;

import cn.edu.xync.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();
    User findUserById(int id);
    void findAllOrdersWithUser();
    void findAllUsersWithOrders();

}
