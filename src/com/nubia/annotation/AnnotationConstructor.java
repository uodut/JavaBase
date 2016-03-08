package com.nubia.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.CONSTRUCTOR,ElementType.METHOD})//�����ж��
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationConstructor {
	String name() default("");
	int age() default(0);
}
