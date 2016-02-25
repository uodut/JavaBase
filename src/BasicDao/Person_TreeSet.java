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
		//�ȽϹ���������ͬ��������˳���������䲻ͬ���������С����
		int nameCompareResult = ageCompareResult == 0?nameCompare:ageCompareResult;
		return nameCompareResult;
	}
	/*TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
	    public int compare(Student s1, Student s2) {
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
	
}
