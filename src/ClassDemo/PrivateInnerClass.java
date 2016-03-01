package ClassDemo;

public class PrivateInnerClass {
	private int age = 11;
	private class In{
		public void print(){
			System.out.println(age);
		}
	}
	public In getInstance(){
		return new In();
	}
	public static void main(String[] args) {
		//私有内部类.In in = new 私有内部类.new  In();
		PrivateInnerClass s = new PrivateInnerClass();//不能支持操作内部类，需要在外部类中提供得到内部类对象的方法。
		s.getInstance().print();
	}
}
