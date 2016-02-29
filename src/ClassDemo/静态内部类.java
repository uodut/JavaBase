package ClassDemo;

public class 静态内部类 {
	private int age = 10;
	private static String name = "tudou";
	static class In{
		void print(){
			//System.out.println(age);//不能访问外部类的非静态成员。这就像是静态方法中不能调用非静态变量一样。
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		静态内部类.In in = new 静态内部类. In();//In被当做是“静态内部类”的一个静态成员，所以可以直接调用，不用实例化
		in.print();
	}
}
