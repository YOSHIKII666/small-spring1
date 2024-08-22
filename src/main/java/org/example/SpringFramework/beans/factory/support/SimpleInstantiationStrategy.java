package org.example.SpringFramework.beans.factory.support;

import org.example.SpringFramework.beans.BeansException;
import org.example.SpringFramework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SimpleInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) throws BeansException {
        Class beanClass = beanDefinition.getBeanClass();
        try{
            if(null != constructor){
                return beanClass.getDeclaredConstructor(constructor.getParameterTypes()).newInstance(args);
            }else{
                return beanClass.getDeclaredConstructor().newInstance();
            }
        } catch (InvocationTargetException e) {
            throw new BeansException("Failed to instantiate bean " + beanName, e);
        } catch (InstantiationException e) {
            throw new BeansException("Failed to instantiate bean " + beanName, e);
        } catch (IllegalAccessException e) {
            throw new BeansException("Failed to instantiate bean " + beanName, e);
        } catch (NoSuchMethodException e) {
            throw new BeansException("Failed to instantiate bean " + beanName, e);
        }
    }
}
