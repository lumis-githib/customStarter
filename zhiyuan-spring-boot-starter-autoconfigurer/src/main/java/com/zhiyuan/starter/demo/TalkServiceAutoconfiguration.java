package com.zhiyuan.starter.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName TalkServiceAutoconfiguration
 * @Description Todo
 * @Author ming.lu
 * @Date 2020/2/28 19:29
 */
/*@Configuration用于定义配置类，可替换xml配置文件，
被注解的类内部包含有一个或多个被@Bean注解的方法，这些方法将会被AnnotationConfigApplicationContext或AnnotationConfigWebApplicationContext类进行扫描
 ，并用于构建bean定义，初始化Spring容器。*/
@Configuration
@ConditionalOnWebApplication//web应用生效,根据@Conditional不同的条件创建不同的bean。Condition是个接口，需要实现matches方法，返回true则注入bean，false则不注入。
@EnableConfigurationProperties(TalKProperties.class)//相当于把使用 @ConfigurationProperties 的类进行了一次注入。
public class TalkServiceAutoconfiguration {
    @Autowired
    TalKProperties talKProperties;
    @Bean
    public TalkService getTalkService(){
        TalkService talkService=new TalkService();
        talkService.setTalKProperties(talKProperties);
        return talkService;

    }
}
