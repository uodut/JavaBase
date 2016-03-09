package com.clazz;
/**
 * 特点：
 * 1、修饰符为public或者protected，默认为public
 * 2、不能实例化，因为抽象类中含有    无具体    实现的方法，也可以看出也可以包含普通的方法。
 * 3、如果一个类继承于一个抽象类，则子类必须实现父类的抽象方法。如果子类没有实现抽象方法，
 * 		则子类本身也需要声明为抽象的。【也就是说含有abstract关键字的类才可以声明抽象方法】
 */
public abstract class AbstractDemo {
    public int age;
    public AbstractDemo() {
        // TODO Auto-generated constructor stub
    }
    void func() {
    }
    abstract void func1();// 抽象方法
}
