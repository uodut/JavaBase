package ClassDemo;

public class ��̬�ڲ��� {
	private int age = 10;
	private static String name = "tudou";
	static class In{
		void print(){
			//System.out.println(age);//���ܷ����ⲿ��ķǾ�̬��Ա��������Ǿ�̬�����в��ܵ��÷Ǿ�̬����һ����
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		��̬�ڲ���.In in = new ��̬�ڲ���. In();//In�������ǡ���̬�ڲ��ࡱ��һ����̬��Ա�����Կ���ֱ�ӵ��ã�����ʵ����
		in.print();
	}
}
