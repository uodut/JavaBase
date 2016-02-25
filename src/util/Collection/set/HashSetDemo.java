package util.Collection.set;

import java.util.HashSet;
import java.util.Iterator;

import BasicDao.Person_HashSet;
/**
 * 
 * @author UODUT
 *	Ԫ�����򣬵���Ψһ����֤Ԫ�ز��ظ���Ԫ�ؿ���Ϊ��ֵ���̲߳���ȫ����ͬ����
 *	һ������ HashSet ���ԣ����ǻ��� HashMap ʵ�ֵģ�HashSet �ײ���� HashMap ����������Ԫ�أ���� 
 *			HashSet �ıȽϼ򵥣���ֻ�Ƿ�װ��һ�� HashMap �������洢���еļ���Ԫ�أ�
			���з��� HashSet �еļ���Ԫ��ʵ������ HashMap �� key �����棬�� HashMap �� value ��洢��һ�� 
			PRESENT������һ����̬�� Object ���� 
 *	������α�֤Ԫ�ص�Ψһ�ԣ�
 *Դ�룺
 *			if (p.hash == hash //hashֵ���
	&& ((k = p.key) == key || (key != null && key.equals(k))))
		����HashSet���Ԫ�ص�ʱ�򣬱Ƚ�hashֵ&&equals()���������ȱȽ�hashֵ(hashCode()����)��������ȣ�����ӣ����
		��ȣ��Ƚ�equals�����Ƿ���ȡ�������߶���ȣ�������ӡ�
 */
public class HashSetDemo {
	static HashSet<Person_HashSet> hashSet = new HashSet<Person_HashSet>();
	public static void main(String[] args) {
		Person_HashSet person1 = new Person_HashSet(20,"zhang");
		Person_HashSet person5 = new Person_HashSet(20,"zhang");
		Person_HashSet person2 = new Person_HashSet(20,"wang");
		Person_HashSet person3 = new Person_HashSet(22,"li");
		Person_HashSet person4 = new Person_HashSet(20,"li");
		hashSet.add(person1);
		hashSet.add(person2);
		hashSet.add(person3);
		hashSet.add(person4);
		hashSet.add(person5);
		
		
		display2(hashSet);
		System.out.println(person1.hashCode());
		System.out.println(person5.hashCode());
		System.out.println(person1.equals(person5));
		System.out.println(hashSet.size());
		
	}
	static void display(HashSet<Person_HashSet> hashSet ){
		Iterator<Person_HashSet> it = hashSet.iterator();
		System.out.println("����" + '\t' + "����");
		while(it.hasNext()){
			System.out.println(it.next().getName()+'\t' + it.next().getAge());
		}
	}
	static void display2(HashSet<Person_HashSet> hashSet){
		System.out.println("����" + '\t' + "����");
		for(Person_HashSet p:hashSet){
			System.out.println(p.getName()+'\t' + p.getAge());
		}
	}
}
