package BasicDao;

public class Person_TreeSet implements Comparable<Object>{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person_TreeSet(int age, String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		Person_TreeSet pt = (Person_TreeSet)o;
		int ageCompareResult = this.age - pt.getAge();
		int nameCompare = this.name.compareTo(pt.getName());
		//比较规则：年龄相同按照姓名顺序排序，年龄不同按照年龄大小排序
		int nameCompareResult = ageCompareResult == 0?nameCompare:ageCompareResult;
		return nameCompareResult;
	}
	/*TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
	    public int compare(Student s1, Student s2) {
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
	
}
