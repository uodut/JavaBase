package com.util.collection.list;
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.log4j.Logger;
/**
 * 
 * addFirst() addLast() element():��ȡͷ��Ԫ�أ����ǲ��Ƴ���ͷ��Ԫ�� getFirst() getLast()
 * offer()����ָ��Ԫ�ز����˫�˶��е�ĩβ�� offerFirst() offerLast() peek() peekFirst()
 * peekLast() poll() pollFirst() pollLast() pop():���� push():װ��
 * remove(),remove(int args)����ȡ���Ƴ������ͷ/ָ��Ԫ�� removeFirst()
 * removeFirstOccurrence(Obj obj)���Ƴ��������е�һ�γ��ֵ�ָ��Ԫ�أ�����ͷ����β����������ʱ�� removeLast()
 * removeLastOccurrence(Obj obj)���Ƴ������������һ�γ��ֵ�ָ��Ԫ�أ�����ͷ����β����������ʱ����
 * 
 * @author UODUT
 *
 */
public class LinkedListDemo {
    static LinkedList<String> ll = new LinkedList<String>();
    public static void main(String[] args) {
        ll.add("john");
        ll.add("ross");
        ll.add("jack");
        ll.add("halen");
        ll.add("joffery");
        ll.add("halen");
        ll.add("chandler");
        String str = ll.pop();
        Logger.getLogger(LinkedListDemo.class).info(ll.size());
        String str2 = ll.pop();
        Logger.getLogger(LinkedListDemo.class).info(ll.size());
        Logger.getLogger(LinkedListDemo.class).info(str2);
        ll.offer("lastelement");
        display();
        Logger.getLogger(LinkedListDemo.class).info("111111111111111");
        ll.removeFirstOccurrence("halen");
        display();
    }
    static void display() {
        Iterator<String> it = ll.iterator();
        while (it.hasNext()) {
            Logger.getLogger(LinkedListDemo.class).info(it.next());
        }
    }
}
