package org.example.SpringFramework;

import org.example.SpringFramework.bean.UserService;
import org.junit.Test;

public class ApiTest {
    @Test
    public void test() {
        BeanFactory beanFactory=new BeanFactory();
        BeanDefinition beanDefinition=new BeanDefinition(new UserService());
        beanFactory.registerBean("userservice",beanDefinition);
        UserService userService=(UserService) beanFactory.getBean("userservice");
        userService.show();
    }
}
