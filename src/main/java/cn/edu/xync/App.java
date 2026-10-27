package cn.edu.xync;

import cn.edu.xync.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object userService = (UserServiceImpl) context.getBean("userService");
        userService.findAllUsers();
    }
}
