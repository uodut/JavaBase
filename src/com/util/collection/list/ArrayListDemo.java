package com.util.collection.list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.log.LogHandler;
/**
 * @author UODUT
 * 
 * 优缺点：低层数据结构是数组，所以便于查找，但是不便于插入,元素可重复，且有序，线程不安全
 * 	优点：查找快，可以根据下标序列直接查找
 * 	缺点：增删慢，需要大量移动元素
 * 包含的函数：
 * 	1.add(),
 * 	2.addAll(Collection<? extends E> other)
 * 	3.remove(),
 * 	4.removeAll(Collection<? extends E> other)
 * 	5.size()
 * 	6.contains(object obj)：如果包含了一个与obj相等的对象，返回true,说明是区分大小写的
 * 	7.containsAll(Collection<?> other):如果这个集合包含other集合中的所有元素，返回true
 * 	7.retainAll(Collection<?> other):从这个集合中删除所有与other集合中的元素不同的元素。
 *  也就是说保留other中的元素
 * 	8.clear()
 * ??9.forEach(Consumer<? super String>)??
 * 	10.get()
 * 	11.getClass()
 * 	12.indexOf(Object obj):返回与指定元素相等的元素在列表中第一次出现的位置，如果没有这样的位置则返回-1
 * 	13.isEmpty()
 * 	14.iterator();迭代函数，返回一个迭代器的对象
 * 	15.lastIndexOf()：返回与指定元素相等的元素在列表中最后一次出现的位置，如果没有这样的位置则返回-1
 * △16.listIterator(),listIterator(int args);??
 * 	17.set(int args1,String args2):用新元素取代给定位置的元素，并返回原来那个元素。
 * 	18.subList(int args1,int args2):返回一个截取的字符串集合
 * 	19.wait()
 * 	
 */
public class ArrayListDemo {
    private static String message = null;
    
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        List<String> other = new ArrayList<String>();// 测试使用
        // 添加元素
        arrayList.add("apple");
        arrayList.add("apple");
        arrayList.add("iphone");
        arrayList.add("last");
        arrayList.add("another");
        arrayList.add(null);
        other.add("another");
        other.add("apple");
        // 迭代器遍历
        Iterator<String> it = arrayList.iterator();// 返回一个迭代器对象
        while (it.hasNext()) {
            if (it.hasNext()) {
             // 到达集合末尾，next()方法会抛出一个NoSuchElementException异常
                LogHandler.createUnSynInstance(ArrayListDemo.class).info(it.next());
            }
        }
        LogHandler.createUnSynInstance(ArrayListDemo.class).info("--------第二种方式--------");
        it.remove();
        for (String s : arrayList) {
            LogHandler.createUnSynInstance(ArrayListDemo.class).info(s);
        }
        // 集合中元素的个数
        LogHandler.createUnSynInstance(ArrayListDemo.class).info(arrayList.size());
        // contains()区分大小写
        LogHandler.createUnSynInstance(ArrayListDemo.class).info(arrayList.size());
        LogHandler.createUnSynInstance(ArrayListDemo.class).info(arrayList.contains("LAST"));
        LogHandler.createUnSynInstance(ArrayListDemo.class).info(arrayList.size() + "--------");
        // retainAll(Collection<?> other)
       // get()
        LogHandler.createUnSynInstance(ArrayListDemo.class).info(arrayList.get(0) + "-------get()");
        // set()
        LogHandler.createUnSynInstance(ArrayListDemo.class).info(arrayList.set(0, "orange"));
        print(arrayList);
        message = "iphone出现的位置为" + arrayList.indexOf("iphone");
        LogHandler.createUnSynInstance(ArrayListDemo.class).info(message);
    }
    public static void print(List<String> arrayList) {
        Object[] array = arrayList.toArray();
        for (int i = 0; i < array.length; i++) {
            LogHandler.createUnSynInstance(ArrayListDemo.class).info(array[i]);
        }
    }
}
