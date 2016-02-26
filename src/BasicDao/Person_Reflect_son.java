package BasicDao;

public class Person_Reflect_son extends Person_Reflect {
	
	private String address;
	public int members;
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMembers() {
		return members;
	}

	public void setMembers(int members) {
		this.members = members;
	}

	public Person_Reflect_son(int age, int score, String name) {
		super(age, score, name);
		// TODO Auto-generated constructor stub
		
	}

	public Person_Reflect_son() {
		super();
	}

}
