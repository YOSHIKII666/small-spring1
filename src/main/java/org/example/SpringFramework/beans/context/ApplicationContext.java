package org.example.SpringFramework.beans.context;

import org.example.SpringFramework.beans.factory.HierarchicalBeanFactory;
import org.example.SpringFramework.beans.factory.ListableBeanFactory;
import org.example.SpringFramework.beans.io.ResourceLoader;

/**
 * 应用上下文
 * 这个接口是BeanFactory的拓展，在本项目中主要还提供了资源访问和生命周期管理的功能。
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader,ApplicationEventPublisher {
}
