package com.clazz;
import org.apache.log4j.Logger;
public class PrivateInnerClass {
    private int age = 11;
    private class In {
        public void print() {
            Logger.getLogger(PlainInnerClass.class).info(age);
        }
    }
    public In getInstance() {
        return new In();
    }
    public static void main(String[] args) {
        // 私有内部类.In in = new 私有内部类.new In();
        // 不能支持操作内部类，需要在外部类中提供得到内部类对象的方法。
        PrivateInnerClass s = new PrivateInnerClass();
        s.getInstance().print();
    }
}
