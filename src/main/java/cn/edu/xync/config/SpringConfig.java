package cn.edu.xync.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * @Description:
 * @Author: GeMeng
 * @Date: 2026/11/16 14:37
 */
@Configuration
@ComponentScan("cn.edu.xync")
@ImportResource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {

}
