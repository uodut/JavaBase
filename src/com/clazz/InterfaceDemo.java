package com.clazz;
/**
 * 特点： 1、接口的成员变量默认修饰符为public static final:只能被接口通过接口名称调用，
 * 因为接口本身不能实例化，而且成员变量不能被修改。 2、成员方法只能是抽象的，不能有具体的实现。 3、可以包含静态成员方法。
 * 
 * @author UODUT
 *
 */
public interface InterfaceDemo {
    int AGE = 0;// 修饰符为public static final,默认为public static final
    // 一般成员方法
    void func();
    /**
     * 静态成员方法
     */
    static int func1() {
        return AGE;
    }
    // 不能含有静态代码块，静态代码块一般用来在加载类的时候用来初始化。
    /*
     * static { System.out.println("parent static block"); }
     */
}
