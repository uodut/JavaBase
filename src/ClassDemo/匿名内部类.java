package ClassDemo;

public class 匿名内部类 {
	public static void main(String[] args) {
		InterfaceDemo id = new InterfaceDemo(){
			public void func(){
				System.out.println("匿名内部类的使用");
			}
		};
		id.func();
	}
}
