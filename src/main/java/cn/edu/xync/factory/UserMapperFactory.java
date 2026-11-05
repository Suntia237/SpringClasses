package cn.edu.xync.factory;

import cn.edu.xync.mapper.UserMapper;
import cn.edu.xync.mapper.UserMapperImpl;

public class UserMapperFactory {
    public static UserMapper getUserMapper() {
        return new UserMapperImpl();
    }
}
