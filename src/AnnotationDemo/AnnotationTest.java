package AnnotationDemo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import BasicDao.PersonAnnotation;

/**
 * 2016��3��1��
 * @author <a href = "wang.gaoliang@zte.com.cn">������</a>
 * �õ�ע������
 */
public class AnnotationTest {
	public static void main(String[] args){
		parseTypeAnnotation();
		parseMethodAnnotation();
		parseConstructorAnnotation();
	}
	//�࣬�ӿڣ�ö��ע��
	static void parseTypeAnnotation(){
		Class<?> clazz;
		try {
			clazz = Class.forName("BasicDao.PersonAnnotation");
			Annotation[] annotations = clazz.getAnnotations();
			for(Annotation annotaion:annotations){
				AnnotationClass ac = (AnnotationClass)annotaion;
				System.out.println(ac.className());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//��Ա����ע��
	static void parseMethodAnnotation(){
		Method[] methods = PersonAnnotation.class.getDeclaredMethods();
		System.out.println(methods.length);
		for(Method method:methods){
			boolean hasAnnotation = method.isAnnotationPresent(AnnotationConstructor.class);
			if(hasAnnotation){
				AnnotationConstructor ac = method.getAnnotation(AnnotationConstructor.class);
				System.out.println("method  = " +method.getName() + '\t'
						+ "name = " + ac.name() + '\t' + "age = " + ac.age());
			}
		}
	}
	//���캯��ע��
	static void parseConstructorAnnotation(){
		Class<?> clazz = new PersonAnnotation().getClass();
		Constructor<?>[] constructors = clazz.getConstructors();
		for(Constructor<?> constructor:constructors){
			boolean hasAnnotation = constructor.isAnnotationPresent(AnnotationConstructor.class);
			if(hasAnnotation){
				AnnotationConstructor ac = constructor.getAnnotation(AnnotationConstructor.class);
				System.out.println("Constuctor = " + constructor.getName()
						+ '\t' + "name = " + ac.name() + '\t' + "age = "
						+ ac.age());
			}
		}
	}
}
