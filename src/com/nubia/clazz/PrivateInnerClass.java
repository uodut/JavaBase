package com.nubia.clazz;

import com.nubia.log.LogHandler;

public class PrivateInnerClass {
    private int age = 11;
    private class In {
        public void print() {
            LogHandler.createUnSynInstance(PlainInnerClass.class).info(age);
        }
    }
    public In getInstance() {
        return new In();
    }
    public static void main(String[] args) {
        // ˽���ڲ���.In in = new ˽���ڲ���.new In();
     // ����֧�ֲ����ڲ��࣬��Ҫ���ⲿ�����ṩ�õ��ڲ������ķ�����
        PrivateInnerClass s = new PrivateInnerClass();
        s.getInstance().print();
    }
}
