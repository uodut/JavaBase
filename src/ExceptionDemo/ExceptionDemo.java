package ExceptionDemo;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("����ֵΪ��"+test1());
	}

	public static int test1() {
		int b = 20;
		try {
			System.out.println("try block");
			return b += 80;
		} catch (Exception e) {
			System.out.println("catch block");
		} finally {
			System.out.println("finally block");
			if (b > 25) {
				b -= 25;
				System.out.println("finally���b���ڣ� " + b);
			}
		}
		return b;
	}
}
