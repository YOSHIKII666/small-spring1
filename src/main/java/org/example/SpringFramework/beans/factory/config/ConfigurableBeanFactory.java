package org.example.SpringFramework.beans.factory.config;

import org.example.SpringFramework.beans.factory.HierarchicalBeanFactory;
import org.example.SpringFramework.beans.util.StringValueResolver;

/***
 *拓展了BeanFactory,添加了一些用于配置和自定义BeanFactory行为的方法，允许用户注册自定义的BeanPostProcessor或者设置Scope
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory,SingletonBeanRegistry {
    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * 销毁单例对象
     */
    void destroySingletons();

    /**
     * Add a String resolver for embedded values such as annotation attributes.
     * @param valueResolver the String resolver to apply to embedded values
     * @since 3.0
     */
    void addEmbeddedValueResolver(StringValueResolver valueResolver);

    /**
     * Resolve the given embedded value, e.g. an annotation attribute.
     * @param value the value to resolve
     * @return the resolved value (may be the original value as-is)
     * @since 3.0
     */
    String resolveEmbeddedValue(String value);

}
