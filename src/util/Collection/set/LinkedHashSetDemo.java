package util.Collection.set;

import java.util.LinkedHashSet;
/**
 * @author UODUT
 * ���ģ��ͨ������õ�һ�� set��������� set��Ȼ�󷵻��ɴ˸���������˳��Ľ����
 * ���������������ر����á����ͻ�ͨ���������ݷ��ص�˳�������ǳ��ֵ�˳����ͬ���� 
 * 
 * �ȱ�֤��Ԫ�ص�Ψһ�ԣ��б�֤��Ԫ�ص������ԣ�������TreeSet,���������ָ���Ǻ����˳������ͬ�ģ�
 *
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		ls.add("john snow");
		ls.add("evil");
		ls.add("joxiya");
		ls.add("hunt");
		System.out.println("--------��ʾ˳��Ͳ���˳��һ��--------");
		display(ls);
		ls.add("test");
		System.out.println("--------����Ԫ�غ���ʾ˳�򲻱�--------");
		display(ls);
		ls.remove("evil");
		System.out.println("---------ɾ��Ԫ�غ�ԭԪ����ʾ˳����Ȼ����-------");
		display(ls);
	}
	static void display(LinkedHashSet<String> ls){
		for(String s:ls){
			System.out.println(s);
		}
	}
}
