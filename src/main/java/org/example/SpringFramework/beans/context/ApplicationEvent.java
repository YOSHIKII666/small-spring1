package org.example.SpringFramework.beans.context;

import java.util.EventObject;


/***
 * EventObject的主要功能和特点包括：
 * 封装事件源：
 * EventObject包含了一个对发出事件的对象（即事件源）的引用。通常通过构造函数传递进来，并可以通过getSource()方法获取。
 * 提供基本属性：
 * 它为所有事件提供了通用的信息，比如事件源对象。
 * 作为继承基类：
 * 大多数具体事件都是从EventObject派生出来的，这样就可以共享一些通用的行为和属性。
 * 支持事件监听器模型：
 * 虽然EventObject本身并不直接支持事件监听器的添加或删除，但它被设计用于与事件监听器模型一起使用。通常情况下，事件发布者会创建一个事件对象，然后将这个对象传递给注册的监听器。
 */
public abstract class ApplicationEvent extends EventObject {
    public ApplicationEvent(Object source) {
        super(source);
    }
}
