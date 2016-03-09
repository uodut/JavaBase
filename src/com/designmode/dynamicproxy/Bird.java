package com.designmode.dynamicproxy;
import org.apache.log4j.Logger;
public class Bird implements Sound, Flyable {
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        //Logger.getLogger(PlainInnerClass.class).info("外部类的私有变量" + age);
        Logger.getLogger(Bird.class).info("Bird can fly");
        
    }
    @Override
    public void sound() {
        // TODO Auto-generated method stub
        Logger.getLogger(Bird.class).info("Bird can speak");
    }
}
