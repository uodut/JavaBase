package util.Collection.set;
import java.util.Iterator;
import java.util.TreeSet;

import BasicDao.PersonTreeSet;
/**
 * 
 * @author UODUT
 * 1��	Ԫ��Ψһ�����򣬻���TreeMap��ʵ�֡�Integer������(��Ĭ��˳��), 
 * 		String������(��Ĭ��˳��), �Զ������洢��ʱ������쳣(û��˳��)
 *	2��	�������Զ�����Ķ������TreeSet��������, ���ַ�ʽ
 *				һ��ʵ��Comparable�ӿ�
 *   					������implements Comparable
 *  					��дcompareTo()����
 *   					�ڷ����ڶ���Ƚ��㷨, ���ݴ�С��ϵ, ����������������
 *   					��ʹ��TreeSet�洢�����ʱ��, add()�����ڲ��ͻ��Զ�����compareTo()�������бȽ�, 
 *   					���ݱȽϽ��ʹ�ö�������ʽ���д洢
 *   			����
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<PersonTreeSet> treeSet = new TreeSet<PersonTreeSet>();
        treeSet.add(new PersonTreeSet(20, "wang"));
        treeSet.add(new PersonTreeSet(30, "zhao"));
        treeSet.add(new PersonTreeSet(21, "zhang"));
        treeSet.add(new PersonTreeSet(20, "liu"));
        treeSet.add(new PersonTreeSet(20, "wang"));
        // ��Ȼ����
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
    // ��Ȼ����
    static void display2(TreeSet<Integer> treeSet) {
        for (Integer i : treeSet) {
            System.out.println(i);
        }
    }
    // ������
    static void display1(TreeSet<PersonTreeSet> pt) {
        System.out.println("����" + '\t' + "����");
        Iterator<PersonTreeSet> it = pt.iterator();
        int i = 0;
        PersonTreeSet ps = null;
        while (it.hasNext()) {// Iterator��next����ÿ����һ�ξͻ�õ������е�һ��Ԫ��
            ps = it.next();
            // ����ģ���������õ�һ���˵������͵ڶ����˵�����
            // System.out.println(it.next().getName() + it.next().getAge());��
            System.out.println(ps.getName() + '\t' + ps.getAge());
        }
    }
    // ��������-For
    static void display(TreeSet<PersonTreeSet> treeSet) {
        System.out.println("����" + '\t' + "����");
        for (PersonTreeSet p : treeSet) {
            System.out.println(p.getName() + '\t' + p.getAge());
        }
    }
}
