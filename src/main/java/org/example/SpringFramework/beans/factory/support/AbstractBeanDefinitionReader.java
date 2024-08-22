package org.example.SpringFramework.beans.factory.support;

import org.example.SpringFramework.beans.io.DefaultResourceLoader;
import org.example.SpringFramework.beans.io.ResourceLoader;

public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {//通过这样的设置(将BeanDefinitionRegistry的步骤放进抽象类中，可以把BeanDefinition的注册操作放进Xml实现类中去完成，而不用像以前那样在单元测试中去显示注册
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
