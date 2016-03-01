package DesignMode.DynamicProxy;

public class Bird implements Sound, Flyable {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Bird can fly");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Bird can speak");
	}

}
