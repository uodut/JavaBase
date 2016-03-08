package com.nubia.util.collection.set;
import java.util.TreeSet;
import java.util.Comparator;//�Ƚ���
import com.nubia.dao.PersonTreeSet2;
import com.nubia.log.LogHandler;
public class TreeSetDemo2 {
    private static String message = null;
    public static void main(String[] args) {
        // TreeSet<Person_TreeSet2> treeSet = new TreeSet<Person_TreeSet2>();
        TreeSet<PersonTreeSet2> treeSet = new TreeSet<PersonTreeSet2>(
                new Comparator<PersonTreeSet2>() {
                    public int compare(PersonTreeSet2 pt1, PersonTreeSet2 pt2) {
                        int nameCompareResult = pt1.getName().compareTo(pt2.getName());
                        int ageCompareResult = pt1.getAge() - pt2.getAge();
                        // �������:������Ȱ������������䲻�Ȱ���������
                        // int result = ageCompareResult == 0
                        // ?nameCompareResult:ageCompareResult;
                        // ���������ʽ��ͬ������������ʽ��ͬ����ʽ����
                        int result = nameCompareResult == 0 ? ageCompareResult : nameCompareResult;
                        return result;
                    }
                });
        treeSet.add(new PersonTreeSet2(20, "wang"));
        treeSet.add(new PersonTreeSet2(30, "zhao"));
        treeSet.add(new PersonTreeSet2(19, "zhang"));
        treeSet.add(new PersonTreeSet2(25, "liu"));
        treeSet.add(new PersonTreeSet2(20, "gao"));
        treeSet.add(new PersonTreeSet2(22, "wang"));
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
        LogHandler.createUnSynInstance(TreeSetDemo2.class).info(treeSet.size());
    }
    static void display(TreeSet<PersonTreeSet2> treeSet) {
        LogHandler.createUnSynInstance(TreeSetDemo2.class).info("����" + '\t' + "����");
        for (PersonTreeSet2 p : treeSet) {
            message= p.getName() + '\t' + p.getAge();
            LogHandler.createUnSynInstance(TreeSetDemo2.class).info(message);
        }
    }
}
