package ClassDemo;
/**
 * 好处：因为内部类可以随意使用外部类的成员变量（包括私有）而不用生成外部类的对象
 * 内部类和外部类的成员变量和访问规则
 *
 */
public class 常规内部类 {
	private int age = 11;
	
	public class In{
		private int age = 12;
		public void print(){
			int age = 13;
			System.out.println("内部类的变量" + age);//默认访问外部类变量，但内部类有同名变量时覆盖外部类变量
			System.out.println("内部成员变量"+this.age);//访问内部成员变量
			System.out.println(常规内部类.this.age);//访问外部类的成员变量
		}
		private void print2(){
			System.out.println("外部类的私有变量" + age);
		}
	}
	
	public static void main(String[] args) {
		/*
		 * 程序编译过后会产生两个.class文件，分别是Out.class和Out$In.class

			其中$代表了上面程序中 常规内部类.In 中的那个 .

			常规内部类.In in = new 常规内部类().new In()可以用来生成内部类的对象，这种方法存在两个小知识点需要注意

　　1.开头的 "常规内部类" 是为了标明需要生成的内部类对象在哪个外部类当中

　　2.必须先有外部类的对象才能生成内部类的对象，因为内部类的作用就是为了访问外部类中的成员变量
		 */
		常规内部类.In in = new 常规内部类().new In();//内部类的实例化方式
		in.print();
		in.print2();//调用内部类的私有成员方法print2()
		
	}

}
