package DesignMode.StaticProxy;
/**
 * 2016��3��1��
 * @author <a href = "wang.gaoliang@zte.com.cn">������</a>
 * ׷�����ࣺͨ�������׷��Ķ����ͻ��Ͳ�ż
 */
public class Pursuit implements GiveGift {
	SchoolGirl girl;
	public Pursuit(SchoolGirl girl){
		this.girl = girl;
	}
	@Override
	public void sendFlower() {
		// TODO Auto-generated method stub
		System.out.println("Pursuit�͸�" + girl.getName() +"�Ļ�");
	}

	@Override
	public void GiveDolls() {
		// TODO Auto-generated method stub
		System.out.println("Pursuit�͸�" + girl.getName() +"�Ĳ�ż");
	}

}
