package ClassDemo;
/**
 * �ô�����Ϊ�ڲ����������ʹ���ⲿ��ĳ�Ա����������˽�У������������ⲿ��Ķ���
 * �ڲ�����ⲿ��ĳ�Ա�����ͷ��ʹ���
 *
 */
public class �����ڲ��� {
	private int age = 11;
	
	public class In{
		private int age = 12;
		public void print(){
			int age = 13;
			System.out.println("�ڲ���ı���" + age);//Ĭ�Ϸ����ⲿ����������ڲ�����ͬ������ʱ�����ⲿ�����
			System.out.println("�ڲ���Ա����"+this.age);//�����ڲ���Ա����
			System.out.println(�����ڲ���.this.age);//�����ⲿ��ĳ�Ա����
		}
		private void print2(){
			System.out.println("�ⲿ���˽�б���" + age);
		}
	}
	
	public static void main(String[] args) {
		/*
		 * ������������������.class�ļ����ֱ���Out.class��Out$In.class

			����$��������������� �����ڲ���.In �е��Ǹ� .

			�����ڲ���.In in = new �����ڲ���().new In()�������������ڲ���Ķ������ַ�����������С֪ʶ����Ҫע��

����1.��ͷ�� "�����ڲ���" ��Ϊ�˱�����Ҫ���ɵ��ڲ���������ĸ��ⲿ�൱��

����2.���������ⲿ��Ķ�����������ڲ���Ķ�����Ϊ�ڲ�������þ���Ϊ�˷����ⲿ���еĳ�Ա����
		 */
		�����ڲ���.In in = new �����ڲ���().new In();//�ڲ����ʵ������ʽ
		in.print();
		in.print2();//�����ڲ����˽�г�Ա����print2()
		
	}

}
