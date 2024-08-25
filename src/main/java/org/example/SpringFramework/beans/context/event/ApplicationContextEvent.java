package org.example.SpringFramework.beans.context.event;

import org.example.SpringFramework.beans.context.ApplicationContext;
import org.example.SpringFramework.beans.context.ApplicationEvent;

/**
 * 定义事件的抽象类，所有的关闭，刷新，用户自己实现的事件都需要继承这个类
 */

public abstract class ApplicationContextEvent extends ApplicationEvent {
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}
