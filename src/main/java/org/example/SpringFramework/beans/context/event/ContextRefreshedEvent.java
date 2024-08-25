package org.example.SpringFramework.beans.context.event;

import org.example.SpringFramework.beans.context.ApplicationEvent;

public class ContextRefreshedEvent extends ApplicationEvent {
    public ContextRefreshedEvent(Object source) {
        super(source);
    }
}
