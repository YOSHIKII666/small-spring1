package org.example.SpringFramework.beans.context.event;

import org.example.SpringFramework.beans.context.ApplicationEvent;
import org.example.SpringFramework.beans.context.ApplicationListener;
import org.example.SpringFramework.beans.factory.BeanFactory;

public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void multicastEvent(final ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }

}