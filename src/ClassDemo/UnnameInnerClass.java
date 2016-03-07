package ClassDemo;

import LogDemo.LogHandler;

public class UnnameInnerClass {
    public static void main(String[] args) {
        InterfaceDemo id = new InterfaceDemo() {
            public void func() {
                LogHandler.createUnSynInstance(PlainInnerClass.class).info("匿名内部类的使用");
            }
        };
        id.func();
    }
}
