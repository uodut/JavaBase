package AnnotationDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 元注解包括：
 * 　		  1.@Target,
　　　　2.@Retention,
　　　　3.@Documented,
　　　　4.@Inherited
 * Target取值(ElementType)有：
 * 　		  1.CONSTRUCTOR:用于描述构造器
　　　　2.FIELD:用于描述域
　　　　3.LOCAL_VARIABLE:用于描述局部变量
　　　　4.METHOD:用于描述方法
　　　　5.PACKAGE:用于描述包
　　　　6.PARAMETER:用于描述参数
　　　　7.TYPE:用于描述类、接口(包括注解类型) 或Enum声明
	Retention取值（RetentionPolicy）有：
　　　　1.SOURCE:在源文件中有效（即源文件保留）
　　　　2.CLASS:在class文件中有效（即class保留）
　　　　3.RUNTIME:在运行时有效（即运行时保留）
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)//如果不加这句的话，在使用反射的时候找不到此注解
public @interface AnnotationClass {
	String className() default "className";
}

