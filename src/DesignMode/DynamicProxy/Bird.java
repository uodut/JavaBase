package DesignMode.DynamicProxy;

import ClassDemo.PlainInnerClass;
import LogDemo.LogHandler;

public class Bird implements Sound, Flyable {
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        //LogHandler.createUnSynInstance(PlainInnerClass.class).info("�ⲿ���˽�б���" + age);
        LogHandler.createUnSynInstance(Bird.class).info("Bird can fly");
        
    }
    @Override
    public void sound() {
        // TODO Auto-generated method stub
        LogHandler.createUnSynInstance(Bird.class).info("Bird can speak");
    }
}
