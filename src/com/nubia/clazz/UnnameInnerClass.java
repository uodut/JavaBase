package com.nubia.clazz;

import com.nubia.log.LogHandler;

public class UnnameInnerClass {
    public static void main(String[] args) {
        InterfaceDemo id = new InterfaceDemo() {
            public void func() {
                LogHandler.createUnSynInstance(PlainInnerClass.class).info("�����ڲ����ʹ��");
            }
        };
        id.func();
    }
}