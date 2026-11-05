package cn.edu.xync;

import cn.edu.xync.mapper.UserMapperImpl;
import cn.edu.xync.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // get container
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // get bean : userService
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");
        UserServiceImpl userService2 = (UserServiceImpl) context.getBean("userService2");

        UserMapperImpl userMapper = context.getBean("userMapper2", UserMapperImpl.class);
        UserMapperImpl userMapper2 = context.getBean("userMapper2", UserMapperImpl.class);
        UserMapperImpl userMapper3 = context.getBean("userMapper2", UserMapperImpl.class);
        UserMapperImpl userMapper4 = context.getBean("userMapper4", UserMapperImpl.class);

//        System.out.println(userMapper);
//        System.out.println(userMapper2);
//        System.out.println(userMapper3);

        System.out.println("----------------------------------------------------------------");
        System.out.println(userMapper4);
        userMapper4.findAllUsers();
        //Hello

        userService2.findAllUsers();
    }
}
