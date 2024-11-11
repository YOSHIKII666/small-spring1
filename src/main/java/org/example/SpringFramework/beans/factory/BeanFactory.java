package org.example.SpringFramework.beans.factory;

import org.example.SpringFramework.beans.BeansException;

/**
 * 这是一个接口，其功能为根据bean的名称来生产bean
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

    <T> T getBean(Class<T> requiredType) throws BeansException;

}
