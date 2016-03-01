package DesignMode.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
/**
 * 2016年3月1日
 * @author <a href = "wang.gaoliang@zte.com.cn">王高亮</a>
 * Bird这个类创建一个动态代理对象，JDK主要会做以下工作：
    1.   获取 Bird上的所有接口列表；
    2.   确定要生成的代理类的类名，默认为：com.sun.proxy.$ProxyXXXX ；
    3.   根据需要实现的接口信息，在代码中动态创建 该Proxy类的字节码；
    4 .  将对应的字节码转换为对应的class 对象；
    5.   创建InvocationHandler 实例handler，用来处理Proxy所有方法调用；
    6.   Proxy 的class对象 以创建的handler对象为参数，实例化一个proxy对象
 */
public class DynamicProxyDemo {
	public static void main(String[] args) {
		Bird bird = new Bird();
		//1、获取对应的ClassLoader  
		ClassLoader classLoader = bird.getClass().getClassLoader();
		//2、获取Bird 所实现的所有接口 
		Class<?>[] interfaces = bird.getClass().getInterfaces();
		// 3.设置一个来自代理传过来的方法调用请求处理器，处理所有的代理对象上的方法调用
		InvocationHandler handler = new InvocationHandlerImpl(bird);//留出invoke()接口
		//4、调用newInstance()创建实例
		Object obj = Proxy.newProxyInstance(classLoader, interfaces, handler);//返回一个指定接口的代理类实例,该接口可以将方法调用指派到指定的调用处理程序。
		Flyable fly = (Flyable)obj;
		fly.fly();
		Sound sound = (Sound)obj;
		sound.sound();
	}
}
