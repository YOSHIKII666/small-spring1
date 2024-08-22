package org.example.SpringFramework.beans.factory.config;

import org.example.SpringFramework.beans.BeansException;
import org.example.SpringFramework.beans.factory.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {
    /**
     * 在所有的BeanDefinition加载完成之后，实例化Bean对象之前，提供修改BeanDefinition属性的机制
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
