package org.example.SpringFramework.aop.aspectj;

import net.sf.cglib.transform.MethodFilter;
import org.aspectj.weaver.tools.PointcutExpression;
import org.aspectj.weaver.tools.PointcutPrimitive;
import org.example.SpringFramework.aop.ClassFilter;
import org.example.SpringFramework.aop.MethodMatcher;
import org.example.SpringFramework.aop.Pointcut;

import org.aspectj.weaver.tools.PointcutParser;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class AspectJExpressionPointcut implements Pointcut, ClassFilter, MethodMatcher {

    private static final Set<PointcutPrimitive> SUPPORTED_PRIMITIVES = new HashSet<PointcutPrimitive>();

    static {
        SUPPORTED_PRIMITIVES.add(PointcutPrimitive.EXECUTION);
    }

    private final PointcutExpression pointcutExpression;

    public AspectJExpressionPointcut(String expression) {
        //创建一个PointcutParser实例。PointcutParser是Spring AOP用来解析切入点表达式的工具类。这里通过
        // 调用静态方法getPointcutParserSupportingSpecifiedPrimitivesAndUsingSpecifiedClassLoaderForResolution来获得一个支持特定原始类型的PointcutParser实例，
        // 并指定使用当前类的类加载器进行解析。
        //SUPPORTED_PRIMITIVES：这是一个枚举或者集合，
        // 包含了支持的原始类型（例如，"execution", "within", "this", "target", "args", "bean"等）。这是为了告诉PointcutParser如何解析特定类型的切入点表达式。
        //this.getClass().getClassLoader()：获取当前类的类加载器，以便在解析过程中能够加载必要的类信息。
        PointcutParser pointcutParser = PointcutParser.getPointcutParserSupportingSpecifiedPrimitivesAndUsingSpecifiedClassLoaderForResolution(SUPPORTED_PRIMITIVES, this.getClass().getClassLoader());
        //这行代码利用上一步创建的PointcutParser实例来解析具体的切入点表达式。expression是一个字符串，代表了切入点表达式的内容。
        pointcutExpression = pointcutParser.parsePointcutExpression(expression);
        //这两行代码的主要目的是创建一个PointcutParser实例并使用它来解析一个给定的切入点表达式。解析后的结果存储在pointcutExpression变量中，后续可以根据这个解析结果来判断哪些方法需要被AOP拦截。
    }

    @Override
    public boolean matches(Class<?> clazz) {
        return pointcutExpression.couldMatchJoinPointsInType(clazz);
    }

    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        return pointcutExpression.matchesMethodExecution(method).alwaysMatches();
    }

    @Override
    public ClassFilter getClassFilter() {
        return this;
    }

    @Override
    public MethodMatcher getMethodMatcher() {
        return this;
    }

}
