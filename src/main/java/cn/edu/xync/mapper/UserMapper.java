package cn.edu.xync.mapper;

import cn.edu.xync.pojo.Order;
import cn.edu.xync.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> findAllUsers();
    @Select("select * from user where uid=#{id}")
    User findUserById(int id);
    @Select("select * from order")
    List<Order> findAllOrdersWithUser();
}
