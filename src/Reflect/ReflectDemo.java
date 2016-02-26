package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import BasicDao.Person_Reflect;
import BasicDao.Person_Reflect_son;

/*
 1��Java����ĸ���
�������京�壺���Ի�ȡ�������е�Java����
2��Java����Ĺ���
����1)�����ж�����ʱ������������
����2)�����ж�����ʱ���������еĳ�Ա�����ͷ���
����3)ͨ�������������Ե��õ�private�ķ���
����4)���ɶ�̬����
3��ʵ��Java�������
����1)Class������ʾ�������е�JavaӦ�ó����е���ͽӿ�
����2)Field���ṩ�й����ӿڵ�������Ϣ���Լ������Ķ�̬����Ȩ��
����3)Constructor���ṩ������ĵ������췽������Ϣ�Լ������ķ���Ȩ��
����4)Method���ṩ�������ӿ���ĳ��������Ϣ
4����дJava�������Ĳ��裺
����1)�������Ȼ�ȡһ�����Class����
�������磺
����Class c1 = Test.class;
����Class c2 = Class.forName(��com.reflection.Test��);
����Class c3 = new Test().getClass();
����2)Ȼ��ֱ����Class�����еķ�������ȡһ���������/����/���췽���Ľṹ
5������÷���������ͨ��Method���invoke����ʵ�ֶ�̬�����ĵ���
����//public Object invoke(Object obj, Object... args)
����//��һ�������������
����//�ڶ�����������ִ�з����ϵĲ���
����//������Ҫ�������ĳ��˽�з��������������˽�з�����Ӧ��Mehtod��������
��������setAccessible(true)
6		c1.getField(String fieldName)���õ����е�ĳ���ض������Զ���
		c1.getFields();ֻ�ܵõ����е�
		c1.getDeclaredFields();����������������Ĭ�ϣ��������ʺ�˽���ֶΣ����������̳е��ֶ�
 */
public class 
ReflectDemo {
	public static void main(String[] args) throws Exception {
		// ��ȡһ�����Class����
		Class<?> c1 = Person_Reflect.class;
		Class<?> c2 = Class.forName("BasicDao.Person_Reflect");
		Class<?> c3 = new Person_Reflect_son().getClass();
		// ��ȡָ���İ���
		String packageName1 = c1.getPackage().getName();// out->BasicDao
		String packageName2 = c2.getPackage().getName();// out->BasicDao
		System.out.println("����Ϊ��" + packageName1);
		// ��ȡ������η�
		int mod = c1.getModifiers();
		String modifier = Modifier.toString(mod);
		System.out.println("������η�Ϊ��" + modifier + "  " + "modֵΪ:"
				+ String.valueOf(mod));
		// ��ȡָ�������ȫ�޶���
		String className = c1.getName();
		System.out.println("����ȫ�޶�����Ϊ��" + className);
		// ��ȡָ����ĸ���(����һ��)
		Class<?> superClazz = c3.getSuperclass();
		System.out.println(superClazz.getName());
		// ��ȡʵ�ֵĽӿڼ���
		Class<?>[] interfaces = c1.getInterfaces();
		for (Class<?> clazz : interfaces) {
			System.out.print("ʵ�ֵĽӿڣ�" + clazz.getName() + " ");
		}
		//��ȡָ����ĳ�Ա����
		Field[] fields = c1.getDeclaredFields();
		for (Field field : fields) {
			modifier = Modifier.toString(field.getModifiers());// ÿ����Ա�ķ������η�
			Class type = field.getType();// ��ȡ�ֶε�������������Ӧ��Class����
			String name = field.getName();// ��ȡ�ֶ���
			if (type.isArray()) {// �����������������Ҫ�ر���
				String arrType = type.getComponentType().getName() + "[]";
				System.out.println(modifier + '\t' + arrType + '\t' + name
						+ ";");
			} else {
				System.out.println(modifier + '\t' + type + '\t' + name + ";");
			}
		}
		// ��ȡ��Ĺ��췽��
		Constructor[] construct = c1.getDeclaredConstructors();
		for (Constructor c : construct) {
			String name = c.getName();// ���췽����
			modifier = Modifier.toString(c.getModifiers());// ���η�
			System.out.println("" + modifier + " " + name + "(");
			Class<?>[] parameters = c.getParameterTypes();// ���췽���Ĳ���
			for (int i = 0; i < parameters.length; i++) {
				if (i > 0)
					System.out.println(" (");
				if (parameters[i].isArray()) {
					System.out.println(parameters[i].getComponentType()
							.getName() + "[]");
				} else {
					System.out.println(parameters[i].getName());
				}
			}
			System.out.println(");");
		}
		System.out.println("-----------------------��Ա����---------------------");
		// ��ȡ��Ա���� public static void main(String[] args)
		Method[] methods = c1.getMethods();
		for (Method method : methods) {
			// ��ȡ���η�
			modifier = Modifier.toString(method.getModifiers());
			// ��ȡ�Ƿ�̬
			// ��ȡ����ֵ����
			Class<?> returnType = method.getReturnType();
			if (returnType.isArray())
				System.out.println(returnType.getComponentType().getName()
						+ "[]");
			else
				System.out.println(returnType.getName());
			// ��Ա��������
			method.getName();
			// �������ͺͷ���ֵ����
			Class<?>[] pt = method.getParameterTypes();// ��������
			for (Class<?> PT : pt) {
				PT.getName();// ��������
				PT.getTypeName();
			}
		}
		System.out.println("---------------����ʹ��--------------------");
		executeMethod(c1);
		
	}
	
	/*-----------------------------------------------------------------------------------------*/
	//����ʹ�ã���������Ը�ֵ
	static void executeMethod(Class<?> c) throws Exception{
		Person_Reflect pr = (Person_Reflect)c.newInstance();
		Method method = c.getDeclaredMethod("setName", String.class);
		method.invoke(pr, "tudou");
		System.out.println(pr.getName());
		method = c.getDeclaredMethod("setAge", int.class);//������һ����ʾ�������ƣ��ڶ�����������
		method.setAccessible(true);
		method.invoke(pr, 20);
		System.out.println(pr.getAge());
	}
	
}
