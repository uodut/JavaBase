package util.Collection.set;
import java.util.Iterator;
import java.util.TreeSet;

import BasicDao.PersonTreeSet;
/**
 * 
 * @author UODUT
 * 1、	元素唯一且有序，基于TreeMap的实现。Integer能排序(有默认顺序), 
 * 		String能排序(有默认顺序), 自定义的类存储的时候出现异常(没有顺序)
 *	2、	如果想把自定义类的对象存入TreeSet进行排序, 两种方式
 *				一、实现Comparable接口
 *   					在类上implements Comparable
 *  					重写compareTo()方法
 *   					在方法内定义比较算法, 根据大小关系, 返回正数负数或零
 *   					在使用TreeSet存储对象的时候, add()方法内部就会自动调用compareTo()方法进行比较, 
 *   					根据比较结果使用二叉树形式进行存储
 *   			二、
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<PersonTreeSet> treeSet = new TreeSet<PersonTreeSet>();
        treeSet.add(new PersonTreeSet(20, "wang"));
        treeSet.add(new PersonTreeSet(30, "zhao"));
        treeSet.add(new PersonTreeSet(21, "zhang"));
        treeSet.add(new PersonTreeSet(20, "liu"));
        treeSet.add(new PersonTreeSet(20, "wang"));
        // 自然排序
        /*
         * TreeSet<Integer> treeSet = new TreeSet<Integer>(); treeSet.add(10);
         * treeSet.add(32); treeSet.add(3); treeSet.add(22); treeSet.add(12);
         * 
         * treeSet.add(21); treeSet.add(12);
         * 
         * treeSet.add(22);
         */
        display(treeSet);
    }
    // 自然排序
    static void display2(TreeSet<Integer> treeSet) {
        for (Integer i : treeSet) {
            System.out.println(i);
        }
    }
    // 迭代器
    static void display1(TreeSet<PersonTreeSet> pt) {
        System.out.println("姓名" + '\t' + "年龄");
        Iterator<PersonTreeSet> it = pt.iterator();
        int i = 0;
        PersonTreeSet ps = null;
        while (it.hasNext()) {// Iterator的next方法每调用一次就会得到集合中的一个元素
            ps = it.next();
            // 错误的，这样会调用第一个人的姓名和第二个人的名字
            // System.out.println(it.next().getName() + it.next().getAge());×
            System.out.println(ps.getName() + '\t' + ps.getAge());
        }
    }
    // 对象排序-For
    static void display(TreeSet<PersonTreeSet> treeSet) {
        System.out.println("姓名" + '\t' + "年龄");
        for (PersonTreeSet p : treeSet) {
            System.out.println(p.getName() + '\t' + p.getAge());
        }
    }
}
