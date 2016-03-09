package com.exception;
import org.apache.log4j.Logger;
public class ExceptionDemo {
    public static void main(String[] args) {
        Logger.getLogger(ExceptionDemo.class).info("返回值为：" + test1());
    }
    public static int test1() {
        int b = 20;
        try {
            Logger.getLogger(ExceptionDemo.class).info("try block");
            return b += 80;
        } catch (ArithmeticException e) {
            Logger.getLogger(ExceptionDemo.class).info(e.getMessage());
        } finally {
            Logger.getLogger(ExceptionDemo.class).info("finally block");
            if (b > 25) {
                b -= 25;
                Logger.getLogger(ExceptionDemo.class).info("finally里的b等于： " + b);
            }
        }
        return b;
    }
}
