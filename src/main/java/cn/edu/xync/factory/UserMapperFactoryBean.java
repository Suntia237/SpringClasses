package cn.edu.xync.factory;

import cn.edu.xync.mapper.UserMapper;
import cn.edu.xync.mapper.UserMapperImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserMapperFactoryBean implements FactoryBean<UserMapper> {

    @Override
    public UserMapper getObject() throws Exception {
        return new UserMapperImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserMapperImpl.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton(); //default value true
    }
}
