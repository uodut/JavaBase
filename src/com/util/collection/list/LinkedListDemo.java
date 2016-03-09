package com.util.collection.list;
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.log4j.Logger;
/**
 * 
 * addFirst() addLast() element():获取头部元素，但是不移除此头部元素 getFirst() getLast()
 * offer()：将指定元素插入此双端队列的末尾。 offerFirst() offerLast() peek() peekFirst()
 * peekLast() poll() pollFirst() pollLast() pop():弹出 push():装入
 * remove(),remove(int args)：获取并移除链表的头/指定元素 removeFirst()
 * removeFirstOccurrence(Obj obj)：移除此链表中第一次出现的指定元素（当从头部到尾部遍历链表时） removeLast()
 * removeLastOccurrence(Obj obj)：移除此链表中最后一次出现的指定元素（当从头部到尾部遍历链表时）。
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
