package util.Collection.set;

import java.util.TreeSet;

import BasicDao.Person_TreeSet2;
import java.util.Comparator;//比较器

public class TreeSetDemo2 {
	
	public static void main(String[] args) {
		//TreeSet<Person_TreeSet2> treeSet = new TreeSet<Person_TreeSet2>();
		TreeSet<Person_TreeSet2> treeSet = new TreeSet<Person_TreeSet2>(
				new Comparator<Person_TreeSet2>(){
					public int compare(Person_TreeSet2 pt1,Person_TreeSet2 pt2){
						int nameCompareResult = pt1.getName().compareTo(pt2.getName());
						int ageCompareResult = pt1.getAge() - pt2.getAge();
						//排序规则:年龄相等按姓名排序，年龄不等按年龄排序
						//int result = ageCompareResult == 0 ?nameCompareResult:ageCompareResult;
						//排序规则：姓式相同按年龄排序，姓式不同按姓式排序
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
		System.out.println(treeSet.size());
	}
	
	static void display(TreeSet<Person_TreeSet2> treeSet) {
		System.out.println("姓名" + '\t' + "年龄");
		for (Person_TreeSet2 p : treeSet) {
			System.out.println(p.getName() + '\t' + p.getAge());
		}
	}
}
