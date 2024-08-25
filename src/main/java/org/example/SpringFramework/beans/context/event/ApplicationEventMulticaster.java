package org.example.SpringFramework.beans.context.event;

import org.example.SpringFramework.beans.context.ApplicationEvent;
import org.example.SpringFramework.beans.context.ApplicationListener;

/**
 * 事件广播器
 *
 */

public interface ApplicationEventMulticaster {

    /**
     * Add a listener to be notified of all events.
     * @param listener the listener to add
     */
    void addApplicationListener(ApplicationListener<?> listener);

    /**
     * Remove a listener from the notification list.
     * @param listener the listener to remove
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     * Multicast the given application event to appropriate listeners.
     * @param event the event to multicast
     */
    void multicastEvent(ApplicationEvent event);

}
