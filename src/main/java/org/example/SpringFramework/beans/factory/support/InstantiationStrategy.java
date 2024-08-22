package org.example.SpringFramework.beans.factory.support;

import org.example.SpringFramework.beans.BeansException;
import org.example.SpringFramework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) throws BeansException;
}
