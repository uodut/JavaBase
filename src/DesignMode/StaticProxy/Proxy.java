package DesignMode.StaticProxy;
/**
 * 2016��3��1��
 * @author <a href = "wang.gaoliang@zte.com.cn">������</a>
 * �����ͻ��Ͳ�ż��׷���ߵ�׷���ˡ�
 */
public class Proxy implements GiveGift {
	private Pursuit p ;
	public Proxy(SchoolGirl girl){
		p = new Pursuit(girl);
	}
	@Override
	public void sendFlower() {
		// TODO Auto-generated method stub
		p.sendFlower();
	}

	@Override
	public void GiveDolls() {
		// TODO Auto-generated method stub
		p.GiveDolls();
	}
	
}
