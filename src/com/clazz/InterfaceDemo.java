package com.clazz;
/**
 * �ص㣺 1���ӿڵĳ�Ա����Ĭ�����η�Ϊpublic static final:ֻ�ܱ��ӿ�ͨ���ӿ����Ƶ��ã�
 * ��Ϊ�ӿڱ�����ʵ���������ҳ�Ա�������ܱ��޸ġ� 2����Ա����ֻ���ǳ���ģ������о����ʵ�֡� 3�����԰�����̬��Ա������
 * 
 * @author UODUT
 *
 */
public interface InterfaceDemo {
    int AGE = 0;// ���η�Ϊpublic static final,Ĭ��Ϊpublic static final
    // һ���Ա����
    void func();
    /**
     * ��̬��Ա����
     */
    static int func1() {
        return AGE;
    }
    // ���ܺ��о�̬����飬��̬�����һ�������ڼ������ʱ��������ʼ����
    /*
     * static { System.out.println("parent static block"); }
     */
}
