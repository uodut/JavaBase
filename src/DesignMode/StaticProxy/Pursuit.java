package DesignMode.StaticProxy;
/**
 * 2016年3月1日
 * @author <a href = "wang.gaoliang@zte.com.cn">王高亮</a>
 * 追求者类：通过代理给追求的对象送花和布偶
 */
public class Pursuit implements GiveGift {
	SchoolGirl girl;
	public Pursuit(SchoolGirl girl){
		this.girl = girl;
	}
	@Override
	public void sendFlower() {
		// TODO Auto-generated method stub
		System.out.println("Pursuit送给" + girl.getName() +"的花");
	}

	@Override
	public void GiveDolls() {
		// TODO Auto-generated method stub
		System.out.println("Pursuit送给" + girl.getName() +"的布偶");
	}

}
