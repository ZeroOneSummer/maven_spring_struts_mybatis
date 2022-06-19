package com.aurora;

import com.aurora.entity.UserEntity;
import com.aurora.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@Slf4j
public class WebTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService userService = (UserService)applicationContext.getBean("userService");
        List<UserEntity> list = userService.getUsers();
        log.info(list.toString());
    }
}
