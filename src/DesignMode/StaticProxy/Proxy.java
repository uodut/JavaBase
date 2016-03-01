package DesignMode.StaticProxy;
/**
 * 2016年3月1日
 * @author <a href = "wang.gaoliang@zte.com.cn">王高亮</a>
 * 代理：送花和布偶给追求者的追求人。
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
