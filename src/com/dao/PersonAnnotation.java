package com.dao;
import com.annotation.AnnotationClass;
import com.annotation.AnnotationConstructor;
@AnnotationClass(className = "PersonAnnotation����ע��")
public class PersonAnnotation {
    @AnnotationConstructor(name = "������ע��", age = 23)
    public PersonAnnotation() {
    }
    private String name;
    private int age;
    private String otherInfo;
    public String getName() {
        return name;
    }
    @AnnotationConstructor(name = "��Ա����ע��")
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
