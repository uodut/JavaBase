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
     *�ڵ��ô�������е�ÿһ������ʱ���ڴ����ڲ���
     *����ֱ�ӵ�����InvocationHandler��invoke������
     *��invoke�������ݴ����ഫ�ݸ��Լ���method������������ʲô������
     *
     *��invoke()����������ԶԴ���Ķ�����д����ﵽ�;�̬������ͬ��Ч����
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String info = "�㽫����invoke��������ǰ������Ϊ" + method.getName();
        LogHandler.createUnSynInstance(InvocationHandlerImpl.class).info(info);
        // method.invoke(bird,null);
        method.invoke(bird, args);// ����bird��method����
        info = method.getName() + "�Ѿ��������";
        LogHandler.createUnSynInstance(InvocationHandlerImpl.class).info(info);
        return null;
    }
}
