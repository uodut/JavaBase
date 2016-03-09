package com.clazz;
import org.apache.log4j.Logger;
public class UnnameInnerClass {
    public static void main(String[] args) {
        InterfaceDemo id = new InterfaceDemo() {
            public void func() {
                Logger.getLogger(PlainInnerClass.class).info("匿名内部类的使用");
            }
        };
        id.func();
    }
}
