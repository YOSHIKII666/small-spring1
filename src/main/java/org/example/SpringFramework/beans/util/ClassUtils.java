package org.example.SpringFramework.beans.util;

public class ClassUtils {
    public static ClassLoader getDefaultClassLoader() {
        ClassLoader classLoader = null;
        try{
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        catch(Throwable e){

        }
        if(classLoader == null){
            classLoader = ClassUtils.class.getClassLoader();
        }
        return classLoader;
    }
}
