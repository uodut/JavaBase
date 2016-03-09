package com.clazz;
import org.apache.log4j.Logger;
public class StaticInnerClass {
    private int age = 10;
    private static String name = "tudou";
    static class In {
        void print() {
            // System.out.println(age);//���ܷ����ⲿ��ķǾ�̬��Ա��������Ǿ�̬�����в��ܵ��÷Ǿ�̬����һ��.
            Logger.getLogger(PlainInnerClass.class).info(name);
        }
    }
    public static void main(String[] args) {
        // In�������ǡ���̬�ڲ��ࡱ��һ����̬��Ա�����Կ���ֱ�ӵ��ã�����ʵ����
        StaticInnerClass.In in = new StaticInnerClass.In();
        in.print();
    }
}
