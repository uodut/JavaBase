package com.clazz;

import com.log.LogHandler;

/**
 * �ô�����Ϊ�ڲ����������ʹ���ⲿ��ĳ�Ա����������˽�У������������ⲿ��Ķ��� �ڲ�����ⲿ��ĳ�Ա�����ͷ��ʹ���
 *
 */
public class PlainInnerClass {
    private int age = 11;
    public class In {
        private int age = 12;
        public void print() {
            int age = 13;
            LogHandler.createUnSynInstance(PlainInnerClass.class).info("�ڲ���ı���" + age);
            LogHandler.createUnSynInstance(PlainInnerClass.class).info("�ڲ���Ա����" + this.age);
            LogHandler.createUnSynInstance(PlainInnerClass.class).info(PlainInnerClass.this.age);
        }
        private void print2() {
            LogHandler.createUnSynInstance(PlainInnerClass.class).info("�ⲿ���˽�б���" + age);
        }
    }
    public static void main(String[] args) {
        /*
         * ������������������.class�ļ����ֱ���Out.class��Out$In.class
         * 
         * ����$��������������� �����ڲ���.In �е��Ǹ� .
         * 
         * �����ڲ���.In in = new �����ڲ���().new In()�������������ڲ���Ķ������ַ�����������С֪ʶ����Ҫע��
         * 
         * ����1.��ͷ�� "�����ڲ���" ��Ϊ�˱�����Ҫ���ɵ��ڲ���������ĸ��ⲿ�൱��
         * 
         * ����2.���������ⲿ��Ķ�����������ڲ���Ķ�����Ϊ�ڲ�������þ���Ϊ�˷����ⲿ���еĳ�Ա����
         */
        PlainInnerClass.In in = new PlainInnerClass().new In();// �ڲ����ʵ������ʽ
        in.print();
        in.print2();// �����ڲ����˽�г�Ա����print2()
    }
}
