package ClassDemo;

public class StaticInnerClass {
	private int age = 10;
	private static String name = "tudou";
	static class In{
		void print(){
			//System.out.println(age);//���ܷ����ⲿ��ķǾ�̬��Ա��������Ǿ�̬�����в��ܵ��÷Ǿ�̬����һ����
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		StaticInnerClass.In in = new StaticInnerClass. In();//In�������ǡ���̬�ڲ��ࡱ��һ����̬��Ա�����Կ���ֱ�ӵ��ã�����ʵ����
		in.print();
	}
}
