package com.nubia.util.collection.set;
import java.util.TreeSet;
import java.util.Comparator;//比较器
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
                        // 排序规则:年龄相等按姓名排序，年龄不等按年龄排序
                        // int result = ageCompareResult == 0
                        // ?nameCompareResult:ageCompareResult;
                        // 排序规则：姓式相同按年龄排序，姓式不同按姓式排序
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
		     // 比较年龄
		     int ageCompareResult = s1.getAge() - s2.getAge();
		     // 比较姓名
		     int nameCompare = s1.getName().compareTo(s2.getName());
		     // 年龄相同比较姓名，年龄不同按照年龄排序
		     int nameCompareResult = ageCompareResult == 0 ? nameCompare
		      : ageCompareResult;
		     return nameCompareResult;
		   }
		   });*/
        display(treeSet);
        LogHandler.createUnSynInstance(TreeSetDemo2.class).info(treeSet.size());
    }
    static void display(TreeSet<PersonTreeSet2> treeSet) {
        LogHandler.createUnSynInstance(TreeSetDemo2.class).info("姓名" + '\t' + "年龄");
        for (PersonTreeSet2 p : treeSet) {
            message= p.getName() + '\t' + p.getAge();
            LogHandler.createUnSynInstance(TreeSetDemo2.class).info(message);
        }
    }
}
