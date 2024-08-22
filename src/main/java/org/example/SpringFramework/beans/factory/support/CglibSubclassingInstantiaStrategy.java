package org.example.SpringFramework.beans.factory.support;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import org.example.SpringFramework.beans.BeansException;
import org.example.SpringFramework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public class CglibSubclassingInstantiaStrategy implements InstantiationStrategy {
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());//设置父类
        enhancer.setCallback(new NoOp() {//通过调用setCallback()方法设置一个MethodInterceptor，这是一个接口，定义了一个intercept()方法，该方法会在代理对象的方法被调用时执行。
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        if (constructor==null) return enhancer.create();
        return enhancer.create(constructor.getParameterTypes(), args);
    }
}
