package com.dao;
import com.annotation.AnnotationClass;
import com.annotation.AnnotationConstructor;
@AnnotationClass(className = "PersonAnnotation，类注解")
public class PersonAnnotation {
    @AnnotationConstructor(name = "构造器注解", age = 23)
    public PersonAnnotation() {
    }
    private String name;
    private int age;
    private String otherInfo;
    public String getName() {
        return name;
    }
    @AnnotationConstructor(name = "成员方法注解")
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    @AnnotationConstructor(age = 13)
    public void setAge(int age) {
        this.age = age;
    }
    public String getOtherInfo() {
        return otherInfo;
    }
    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }
}
