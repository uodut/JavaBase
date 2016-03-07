package DesignMode.DynamicProxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import LogDemo.LogHandler;
public class InvocationHandlerImpl implements InvocationHandler {
    private Bird bird;
    public InvocationHandlerImpl(Bird bird) {
        this.bird = bird;
    }
    @Override
    /**
     *在调用代理对象中的每一个方法时，在代码内部，
     *都是直接调用了InvocationHandler的invoke方法，
     *而invoke方法根据代理类传递给自己的method参数来区分是什么方法。
     *
     *在invoke()方法里面可以对代理的对象进行处理。达到和静态代理相同的效果。
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String info = "你将调用invoke方法，当前方法名为" + method.getName();
        LogHandler.createUnSynInstance(InvocationHandlerImpl.class).info(info);
        // method.invoke(bird,null);
        method.invoke(bird, args);// 调用bird的method方法
        info = method.getName() + "已经调用完毕";
        LogHandler.createUnSynInstance(InvocationHandlerImpl.class).info(info);
        return null;
    }
}
