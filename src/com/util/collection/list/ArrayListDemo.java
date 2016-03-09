package com.util.collection.list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
/**
 * @author UODUT
 * 
 * ��ȱ�㣺�Ͳ����ݽṹ�����飬���Ա��ڲ��ң����ǲ����ڲ���,Ԫ�ؿ��ظ����������̲߳���ȫ
 * 	�ŵ㣺���ҿ죬���Ը����±�����ֱ�Ӳ���
 * 	ȱ�㣺��ɾ������Ҫ�����ƶ�Ԫ��
 * �����ĺ�����
 * 	1.add(),
 * 	2.addAll(Collection<? extends E> other)
 * 	3.remove(),
 * 	4.removeAll(Collection<? extends E> other)
 * 	5.size()
 * 	6.contains(object obj)�����������һ����obj��ȵĶ��󣬷���true,˵�������ִ�Сд��
 * 	7.containsAll(Collection<?> other):���������ϰ���other�����е�����Ԫ�أ�����true
 * 	7.retainAll(Collection<?> other):�����������ɾ��������other�����е�Ԫ�ز�ͬ��Ԫ�ء�
 *  Ҳ����˵����other�е�Ԫ��
 * 	8.clear()
 * ??9.forEach(Consumer<? super String>)??
 * 	10.get()
 * 	11.getClass()
 * 	12.indexOf(Object obj):������ָ��Ԫ����ȵ�Ԫ�����б��е�һ�γ��ֵ�λ�ã����û��������λ���򷵻�-1
 * 	13.isEmpty()
 * 	14.iterator();��������������һ���������Ķ���
 * 	15.lastIndexOf()��������ָ��Ԫ����ȵ�Ԫ�����б������һ�γ��ֵ�λ�ã����û��������λ���򷵻�-1
 * ��16.listIterator(),listIterator(int args);??
 * 	17.set(int args1,String args2):����Ԫ��ȡ������λ�õ�Ԫ�أ�������ԭ���Ǹ�Ԫ�ء�
 * 	18.subList(int args1,int args2):����һ����ȡ���ַ�������
 * 	19.wait()
 * 	
 */
public class ArrayListDemo {
    private static String message = null;
    
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        List<String> other = new ArrayList<String>();// ����ʹ��
        // ���Ԫ��
        arrayList.add("apple");
        arrayList.add("apple");
        arrayList.add("iphone");
        arrayList.add("last");
        arrayList.add("another");
        arrayList.add(null);
        other.add("another");
        other.add("apple");
        // ����������
        Iterator<String> it = arrayList.iterator();// ����һ������������
        while (it.hasNext()) {
            if (it.hasNext()) {
             // ���Ｏ��ĩβ��next()�������׳�һ��NoSuchElementException�쳣
                Logger.getLogger(ArrayListDemo.class).info(it.next());
            }
        }
        Logger.getLogger(ArrayListDemo.class).info("--------�ڶ��ַ�ʽ--------");
        it.remove();
        for (String s : arrayList) {
            Logger.getLogger(ArrayListDemo.class).info(s);
        }
        // ������Ԫ�صĸ���
        Logger.getLogger(ArrayListDemo.class).info(arrayList.size());
        // contains()���ִ�Сд
        Logger.getLogger(ArrayListDemo.class).info(arrayList.size());
        Logger.getLogger(ArrayListDemo.class).info(arrayList.contains("LAST"));
        Logger.getLogger(ArrayListDemo.class).info(arrayList.size() + "--------");
        // retainAll(Collection<?> other)
       // get()
        Logger.getLogger(ArrayListDemo.class).info(arrayList.get(0) + "-------get()");
        // set()
        Logger.getLogger(ArrayListDemo.class).info(arrayList.set(0, "orange"));
        print(arrayList);
        message = "iphone���ֵ�λ��Ϊ" + arrayList.indexOf("iphone");
        Logger.getLogger(ArrayListDemo.class).info(message);
    }
    public static void print(List<String> arrayList) {
        Object[] array = arrayList.toArray();
        for (int i = 0; i < array.length; i++) {
            Logger.getLogger(ArrayListDemo.class).info(array[i]);
        }
    }
}
