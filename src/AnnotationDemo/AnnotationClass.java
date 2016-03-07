package AnnotationDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * Ԫע�������
 * ��		  1.@Target,
��������2.@Retention,
��������3.@Documented,
��������4.@Inherited
 * Targetȡֵ(ElementType)�У�
 * ��		  1.CONSTRUCTOR:��������������
��������2.FIELD:����������
��������3.LOCAL_VARIABLE:���������ֲ�����
��������4.METHOD:������������
��������5.PACKAGE:����������
��������6.PARAMETER:������������
��������7.TYPE:���������ࡢ�ӿ�(����ע������) ��Enum����
	Retentionȡֵ��RetentionPolicy���У�
��������1.SOURCE:��Դ�ļ�����Ч����Դ�ļ�������
��������2.CLASS:��class�ļ�����Ч����class������
��������3.RUNTIME:������ʱ��Ч��������ʱ������
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)//����������Ļ�����ʹ�÷����ʱ���Ҳ�����ע��
public @interface AnnotationClass {
	String className() default "className";
}

