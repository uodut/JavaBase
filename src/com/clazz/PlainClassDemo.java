package com.clazz;

import org.apache.log4j.Logger;

public class PlainClassDemo implements InterfaceDemo {
    public PlainClassDemo() {
        // TODO Auto-generated constructor stub
    }
    public static void main(String[] args) {
        PlainClassDemo pc = new PlainClassDemo();
        int age = InterfaceDemo.func1();
        //System.out.println(InterfaceDemo.func1());
        //Logger.getLogger(PlainClassDemo.class).info(InterfaceDemo.func1());
        Logger.getLogger(PlainClassDemo.class).info(InterfaceDemo.func1());
    }
    @Override
    public void func() {
        // TODO Auto-generated method stub
    }
}
