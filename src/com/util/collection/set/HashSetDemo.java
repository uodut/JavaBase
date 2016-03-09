package com.util.collection.set;
import java.util.HashSet;
import java.util.Iterator;
import com.dao.PersonHashSet;
import org.apache.log4j.Logger;
/**
 * 
 * @author UODUT
 *	元素无序，但是唯一，保证元素不重复，元素可以为空值，线程不安全（不同步）
 *	一、对于 HashSet 而言，它是基于 HashMap 实现的，HashSet 底层采用 HashMap 来保存所有元素，因此 
 *			HashSet 的比较简单，它只是封装了一个 HashMap 对象来存储所有的集合元素，
			所有放入 HashSet 中的集合元素实际上由 HashMap 的 key 来保存，
			而 HashMap 的 value 则存储了一个 PRESENT，它是一个静态的 Object 对象。 
 *	二、如何保证元素的唯一性？
 *源码：
 *			if (p.hash == hash //hash值相等
	&& ((k = p.key) == key || (key != null && key.equals(k))))
		在向HashSet添加元素的时候，比较hash值&&equals()方法。首先比较hash值(hashCode()方法)，
		如果不等，则不添加，如果相等，比较equals（）是否相等。如果二者都相等，则不能添加。
 */
public class HashSetDemo {
    static HashSet<PersonHashSet> hashSet = new HashSet<PersonHashSet>();
    private static String message = null;
    public static void main(String[] args) {
        PersonHashSet person1 = new PersonHashSet(20, "zhang");
        PersonHashSet person5 = new PersonHashSet(20, "zhang");
        PersonHashSet person2 = new PersonHashSet(20, "wang");
        PersonHashSet person3 = new PersonHashSet(22, "li");
        PersonHashSet person4 = new PersonHashSet(20, "li");
        hashSet.add(person1);
        hashSet.add(person2);
        hashSet.add(person3);
        hashSet.add(person4);
        hashSet.add(person5);
        display2(hashSet);
        Logger.getLogger(HashSetDemo.class).info(person1.hashCode());
        Logger.getLogger(HashSetDemo.class).info(person5.hashCode());
        Logger.getLogger(HashSetDemo.class).info(person1.equals(person5));
        Logger.getLogger(HashSetDemo.class).info(hashSet.size());
    }
    static void display(HashSet<PersonHashSet> hashSet) {
        Iterator<PersonHashSet> it = hashSet.iterator();
        Logger.getLogger(HashSetDemo.class).info("姓名" + '\t' + "年龄");
        while (it.hasNext()) {
            message = it.next().getName() + '\t' + it.next().getAge();
            Logger.getLogger(HashSetDemo.class).info(message);
        }
    }
    static void display2(HashSet<PersonHashSet> hashSet) {
        Logger.getLogger(HashSetDemo.class).info("姓名" + '\t' + "年龄");
        for (PersonHashSet p : hashSet) {
            Logger.getLogger(HashSetDemo.class).info(p.getName() + '\t' + p.getAge());
        }
    }
}
