import cn.edu.xync.config.SpringConfig;
import cn.edu.xync.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: GeMeng
 * @Date: 2026/10/26 15:52
 */
public class App {
    public static void main(String[] args) {
        // get container
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//    get bean ：userService
        UserServiceImpl userService = context.getBean(UserServiceImpl.class);
        userService.findAllUsers();
// get the resultset ,output to console



        /*UserServiceImpl userService =(UserServiceImpl) context.getBean("userService");
        UserServiceImpl userService2 = context.getBean("userService2", UserServiceImpl.class);
        UserMapperImpl userMapper = context.getBean("userMapper",UserMapperImpl.class);
        UserMapperImpl userMapper2 = context.getBean("userMapper2",UserMapperImpl.class);
        UserMapperImpl userMapper3 = context.getBean("userMapper2",UserMapperImpl.class);
        UserMapperImpl userMapper4 = context.getBean("userMapper4",UserMapperImpl.class);*/

//        test bean
//        userMapper.findAllUsers();
        /*System.out.println(userMapper);
        System.out.println(userMapper2);
        System.out.println(userMapper3);*/
        /* userService2.findAllUsers();*/
//        userMapper4.findAllUsers();
        context.registerShutdownHook();

     /*   DataDI dataDI = context.getBean("dataDI", DataDI.class);
        dataDI.show();

        Object druid = context.getBean("druidDataSource");
        System.out.println(druid);*/
//        context.close();

    }
}
