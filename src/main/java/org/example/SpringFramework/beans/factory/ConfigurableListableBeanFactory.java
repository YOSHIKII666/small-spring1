package org.example.SpringFramework.beans.factory;

import org.example.SpringFramework.beans.BeansException;
import org.example.SpringFramework.beans.factory.config.AutowireCapableBeanFactory;
import org.example.SpringFramework.beans.factory.config.BeanDefinition;
import org.example.SpringFramework.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends AutowireCapableBeanFactory,ListableBeanFactory, ConfigurableBeanFactory {
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;
}
