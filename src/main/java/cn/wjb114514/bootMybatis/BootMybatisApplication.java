package cn.wjb114514.bootMybatis;

import cn.wjb114514.bootMybatis.mapper.CountryMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = {"cn.wjb114514.bootMybatis.mapper", "tk.mybatis.simple.mapper"},
        nameGenerator = cn.wjb114514.bootMybatis.MapperNameGenerator.class)
public class BootMybatisApplication/* implements CommandLineRunner*/ {


//    private CountryMapper mapper;
//
//    @Autowired
//    public BootMybatisApplication(CountryMapper mapper) {
//        this.mapper = mapper;
//    }

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(BootMybatisApplication.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }


//    @Override
//    public void run(String... args) throws Exception {
//        mapper.selectCountryById(1L);
//    }
}
