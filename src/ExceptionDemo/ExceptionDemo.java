package ExceptionDemo;
import DesignMode.StaticProxy.Pursuit;
import LogDemo.LogHandler;
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("返回值为：" + test1());
    }
    public static int test1() {
        int b = 20;
        try {
            LogHandler.createUnSynInstance(ExceptionDemo.class).info("try block");
            return b += 80;
        } catch (Exception e) {
            LogHandler.createUnSynInstance(ExceptionDemo.class).info(e.getMessage());
        } finally {
            LogHandler.createUnSynInstance(ExceptionDemo.class).info("finally block");
            if (b > 25) {
                b -= 25;
                LogHandler.createUnSynInstance(ExceptionDemo.class).info("finally里的b等于： " + b);
            }
        }
        return b;
    }
}
