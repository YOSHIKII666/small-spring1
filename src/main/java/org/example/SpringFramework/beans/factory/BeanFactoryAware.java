package org.example.SpringFramework.beans.factory;

import org.example.SpringFramework.beans.BeansException;

public interface BeanFactoryAware extends Aware {
    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
