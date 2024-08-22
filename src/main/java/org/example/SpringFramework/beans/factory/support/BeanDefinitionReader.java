package org.example.SpringFramework.beans.factory.support;

import org.example.SpringFramework.beans.BeansException;
import org.example.SpringFramework.beans.io.Resource;
import org.example.SpringFramework.beans.io.ResourceLoader;

/**
 * 这个接口的抽象类是AbstractBeanDefinitionReader,实现类XmlBeanDefinitionReader,处理了资源读取后注册Bean的容器操作。
 * 接口负责定义，抽象类处理非接口功能外的注册Bean组件的填充，最终只需要关心具体的业务实现。
 */

public interface BeanDefinitionReader {
    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;
}
