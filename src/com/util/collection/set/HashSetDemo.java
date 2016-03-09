package com.util.collection.set;
import java.util.HashSet;
import java.util.Iterator;
import com.dao.PersonHashSet;
import org.apache.log4j.Logger;
/**
 * 
 * @author UODUT
 *	Ԫ�����򣬵���Ψһ����֤Ԫ�ز��ظ���Ԫ�ؿ���Ϊ��ֵ���̲߳���ȫ����ͬ����
 *	һ������ HashSet ���ԣ����ǻ��� HashMap ʵ�ֵģ�HashSet �ײ���� HashMap ����������Ԫ�أ���� 
 *			HashSet �ıȽϼ򵥣���ֻ�Ƿ�װ��һ�� HashMap �������洢���еļ���Ԫ�أ�
			���з��� HashSet �еļ���Ԫ��ʵ������ HashMap �� key �����棬
			�� HashMap �� value ��洢��һ�� PRESENT������һ����̬�� Object ���� 
 *	������α�֤Ԫ�ص�Ψһ�ԣ�
 *Դ�룺
 *			if (p.hash == hash //hashֵ���
	&& ((k = p.key) == key || (key != null && key.equals(k))))
		����HashSet���Ԫ�ص�ʱ�򣬱Ƚ�hashֵ&&equals()���������ȱȽ�hashֵ(hashCode()����)��
		������ȣ�����ӣ������ȣ��Ƚ�equals�����Ƿ���ȡ�������߶���ȣ�������ӡ�
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
        Logger.getLogger(HashSetDemo.class).info("����" + '\t' + "����");
        while (it.hasNext()) {
            message = it.next().getName() + '\t' + it.next().getAge();
            Logger.getLogger(HashSetDemo.class).info(message);
        }
    }
    static void display2(HashSet<PersonHashSet> hashSet) {
        Logger.getLogger(HashSetDemo.class).info("����" + '\t' + "����");
        for (PersonHashSet p : hashSet) {
            Logger.getLogger(HashSetDemo.class).info(p.getName() + '\t' + p.getAge());
        }
    }
}
