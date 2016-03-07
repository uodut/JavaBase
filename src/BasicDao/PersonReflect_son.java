package BasicDao;

public class PersonReflect_son extends PersonReflect {
	
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

	public PersonReflect_son(int age, int score, String name) {
		super(age, score, name);
		// TODO Auto-generated constructor stub
		
	}

	public PersonReflect_son() {
		super();
	}

}
