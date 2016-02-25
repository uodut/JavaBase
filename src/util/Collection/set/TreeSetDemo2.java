package util.Collection.set;

import java.util.TreeSet;

import BasicDao.Person_TreeSet2;
import java.util.Comparator;//�Ƚ���

public class TreeSetDemo2 {
	
	public static void main(String[] args) {
		//TreeSet<Person_TreeSet2> treeSet = new TreeSet<Person_TreeSet2>();
		TreeSet<Person_TreeSet2> treeSet = new TreeSet<Person_TreeSet2>(
				new Comparator<Person_TreeSet2>(){
					public int compare(Person_TreeSet2 pt1,Person_TreeSet2 pt2){
						int nameCompareResult = pt1.getName().compareTo(pt2.getName());
						int ageCompareResult = pt1.getAge() - pt2.getAge();
						//�������:������Ȱ������������䲻�Ȱ���������
						//int result = ageCompareResult == 0 ?nameCompareResult:ageCompareResult;
						//���������ʽ��ͬ������������ʽ��ͬ����ʽ����
						int result = nameCompareResult == 0 ?ageCompareResult:nameCompareResult;
						return result;
					}
				}
			);
		treeSet.add(new Person_TreeSet2(20,"wang"));
		treeSet.add(new Person_TreeSet2(30,"zhao"));
		treeSet.add(new Person_TreeSet2(19,"zhang"));
		treeSet.add(new Person_TreeSet2(25,"liu"));
		treeSet.add(new Person_TreeSet2(20,"gao"));
		treeSet.add(new Person_TreeSet2(22,"wang"));
		
		
	/*	TreeSet<Person_TreeSet2> ts = new TreeSet<Person_TreeSet2>(new Comparator<Person_TreeSet2>() {
		    public int compare(Person_TreeSet2 s1, Person_TreeSet2 s2) {
		     // �Ƚ�����
		     int ageCompareResult = s1.getAge() - s2.getAge();
		     // �Ƚ�����
		     int nameCompare = s1.getName().compareTo(s2.getName());
		     // ������ͬ�Ƚ����������䲻ͬ������������
		     int nameCompareResult = ageCompareResult == 0 ? nameCompare
		      : ageCompareResult;
		     return nameCompareResult;
		   }
		   });*/
	
		display(treeSet);
		System.out.println(treeSet.size());
	}
	
	static void display(TreeSet<Person_TreeSet2> treeSet) {
		System.out.println("����" + '\t' + "����");
		for (Person_TreeSet2 p : treeSet) {
			System.out.println(p.getName() + '\t' + p.getAge());
		}
	}
}
