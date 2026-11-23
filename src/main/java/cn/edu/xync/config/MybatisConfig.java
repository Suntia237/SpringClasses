package cn.edu.xync.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Description:
 * @Author: GeMeng
 * @Date: 2026/11/19 16:38
 */
@MapperScan("cn.edu.xync.mapper")
public class MybatisConfig {
//    Step1: create method
//    step2: create instance
//    step3: configure instance
//    step4: return instance
//    step5: add @Bean annotation
   /* @Bean
    public SqlSessionFactory sqlSessionFactory() {
        InputStream inpputStream =null;
        try {
            inpputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(inpputStream);
        return factory;
    }*/

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setTypeAliasesPackage("cn.edu.xync.pojo");
        return factoryBean;
    }

   /* @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        configurer.setBasePackage("cn.edu.xync.mapper");
        return configurer;
    }*/

}
