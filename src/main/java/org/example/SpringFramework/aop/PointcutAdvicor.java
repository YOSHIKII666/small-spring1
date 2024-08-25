package org.example.SpringFramework.aop;

import org.aopalliance.aop.Advice;

public interface PointcutAdvicor extends Advisor {
    Pointcut getPointcut();
}
