package ClassDemo;

public class UnnameInnerClass {
	public static void main(String[] args) {
		InterfaceDemo id = new InterfaceDemo(){
			public void func(){
				System.out.println("�����ڲ����ʹ��");
			}
		};
		id.func();
	}
}
