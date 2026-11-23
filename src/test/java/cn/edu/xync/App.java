package cn.edu.xync;

import cn.edu.xync.config.SpringConfig;
import cn.edu.xync.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService userService = context.getBean(UserService.class);

        userService.findAllUsers();
        userService.findUserById(1);
    }
}
