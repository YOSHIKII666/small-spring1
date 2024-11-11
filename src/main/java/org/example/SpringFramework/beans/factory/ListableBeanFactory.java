package org.example.SpringFramework.beans.factory;

import org.example.SpringFramework.beans.BeansException;

import java.util.Map;

public interface ListableBeanFactory extends BeanFactory {
    /**
     * 按照类型返回 Bean 实例,比如在AbstractApplicationContext中根据BeanFactoryPostProcessor,BeanPostProcessor接口返回对应的后处理器
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * Return the names of all beans defined in this registry.
     *
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();
}
