package com.util.collection.set;
import java.util.LinkedHashSet;
import org.apache.log4j.Logger;
/**
 * @author UODUT ���ģ��ͨ������õ�һ�� set��������� set��Ȼ�󷵻��ɴ˸���������˳��Ľ����
 *         ���������������ر����á����ͻ�ͨ���������ݷ��ص�˳�������ǳ��ֵ�˳����ͬ����
 * 
 *         �ȱ�֤��Ԫ�ص�Ψһ�ԣ��б�֤��Ԫ�ص������ԣ�������TreeSet,���������ָ���Ǻ����˳������ͬ�ģ�
 *
 */
public class LinkedHashSetDemo {
    private static String message = null;
    public static void main(String[] args) {
        LinkedHashSet<String> ls = new LinkedHashSet<String>();
        ls.add("john snow");
        ls.add("evil");
        ls.add("joxiya");
        ls.add("hunt");
        message = "--------��ʾ˳��Ͳ���˳��һ��--------";
        Logger.getLogger(LinkedHashSetDemo.class).info(message);
        display(ls);
        ls.add("test");
        message = "--------����Ԫ�غ���ʾ˳�򲻱�--------";
        Logger.getLogger(LinkedHashSetDemo.class).info(message);
        display(ls);
        ls.remove("evil");
        message = "---------ɾ��Ԫ�غ�ԭԪ����ʾ˳����Ȼ����-------";
        Logger.getLogger(LinkedHashSetDemo.class).info(message);
        display(ls);
    }
    static void display(LinkedHashSet<String> ls) {
        for (String s : ls) {
            Logger.getLogger(LinkedHashSetDemo.class).info(s);
        }
    }
}
