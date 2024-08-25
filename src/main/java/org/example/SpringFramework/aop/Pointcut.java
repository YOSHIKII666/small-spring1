package org.example.SpringFramework.aop;

import net.sf.cglib.transform.MethodFilter;

/**
 * 一个切面类，有着类拦截器和方法匹配器
 */
public interface Pointcut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
