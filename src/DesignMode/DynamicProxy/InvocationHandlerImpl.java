package DesignMode.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationHandlerImpl implements InvocationHandler {
	private Bird bird ;
	public InvocationHandlerImpl(Bird bird){
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
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("�㽫����invoke��������ǰ������Ϊ" +method.getName() );
		//method.invoke(bird,null);
		method.invoke(bird, args);//����bird��method����
		System.out.println(method.getName()+"�Ѿ��������");
		return null;
	}

}
