package ClassDemo;

public class ˽���ڲ��� {
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
		//˽���ڲ���.In in = new ˽���ڲ���.new  In();
		˽���ڲ��� s = new ˽���ڲ���();//����֧�ֲ����ڲ��࣬��Ҫ���ⲿ�����ṩ�õ��ڲ������ķ�����
		s.getInstance().print();
	}
}
