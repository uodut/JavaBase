package ClassDemo;
/**
 * �ص㣺
 * 1���ӿڵĳ�Ա����Ĭ�����η�Ϊpublic static final:ֻ�ܱ��ӿ�ͨ���ӿ����Ƶ��ã�
 * ��Ϊ�ӿڱ�������ʵ���������ҳ�Ա�������ܱ��޸ġ�
 * 2����Ա����ֻ���ǳ���ģ������о����ʵ�֡�
 * 3�����԰�����̬��Ա������
 * @author UODUT
 *
 */
public interface InterfaceDemo {
	public static void main(String[] args){
		
	}
	public static final int age = 0;//���η�Ϊpublic static final,Ĭ��Ϊpublic static final
	//һ���Ա����
	void func();
	/**
	 * ��̬��Ա����
	 */
	public static  int func1(){
		return age;
	}
	//���ܺ��о�̬����飬��̬�����һ�������ڼ������ʱ��������ʼ����
	/*static { 
		System.out.println("parent static block"); 
		} */
}