package org.example.SpringFramework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {
    Map<String,BeanDefinition> map=new ConcurrentHashMap<>();
    public Object getBean(String name){
        return map.get(name).getBean();
    }
    public void registerBean(String name,BeanDefinition beanDefinition){
        map.put(name,beanDefinition);
    }
}
