package DesignMode.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
/**
 * 2016��3��1��
 * @author <a href = "wang.gaoliang@zte.com.cn">������</a>
 * Bird����ഴ��һ����̬�������JDK��Ҫ�������¹�����
    1.   ��ȡ Bird�ϵ����нӿ��б�
    2.   ȷ��Ҫ���ɵĴ������������Ĭ��Ϊ��com.sun.proxy.$ProxyXXXX ��
    3.   ������Ҫʵ�ֵĽӿ���Ϣ���ڴ����ж�̬���� ��Proxy����ֽ��룻
    4 .  ����Ӧ���ֽ���ת��Ϊ��Ӧ��class ����
    5.   ����InvocationHandler ʵ��handler����������Proxy���з������ã�
    6.   Proxy ��class���� �Դ�����handler����Ϊ������ʵ����һ��proxy����
 */
public class DynamicProxyDemo {
	public static void main(String[] args) {
		Bird bird = new Bird();
		//1����ȡ��Ӧ��ClassLoader  
		ClassLoader classLoader = bird.getClass().getClassLoader();
		//2����ȡBird ��ʵ�ֵ����нӿ� 
		Class<?>[] interfaces = bird.getClass().getInterfaces();
		// 3.����һ�����Դ��������ķ������������������������еĴ�������ϵķ�������
		InvocationHandler handler = new InvocationHandlerImpl(bird);//����invoke()�ӿ�
		//4������newInstance()����ʵ��
		Object obj = Proxy.newProxyInstance(classLoader, interfaces, handler);//����һ��ָ���ӿڵĴ�����ʵ��,�ýӿڿ��Խ���������ָ�ɵ�ָ���ĵ��ô������
		Flyable fly = (Flyable)obj;
		fly.fly();
		Sound sound = (Sound)obj;
		sound.sound();
	}
}
