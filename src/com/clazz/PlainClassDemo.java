package com.clazz;

import com.log.LogHandler;

public class PlainClassDemo implements InterfaceDemo {
    public PlainClassDemo() {
        // TODO Auto-generated constructor stub
    }
    public static void main(String[] args) {
        PlainClassDemo pc = new PlainClassDemo();
        int age = InterfaceDemo.func1();
        //System.out.println(InterfaceDemo.func1());
        LogHandler.createUnSynInstance(PlainClassDemo.class).info(InterfaceDemo.func1());
    }
    @Override
    public void func() {
        // TODO Auto-generated method stub
    }
}
