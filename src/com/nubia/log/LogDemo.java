package com.nubia.log;
import org.apache.log4j.Logger;
public class LogDemo {
    private static Logger logger = Logger.getLogger(LogDemo.class);
    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            int i = 1 / 0;
        } catch (ArithmeticException e) {
            // TODO Auto-generated catch block
            logger.debug(e.getMessage());
            logger.info(logger.getName());
            /*
             * logger.info(e.getMessage()); // 记录error级别的信息
             * logger.error(e.getMessage());
             */
            // e.printStackTrace();
        }
        /*
         * // 记录debug级别的信息 logger.debug("This is debug message."); //
         * 记录info级别的信息 logger.info("This is info message."); // 记录error级别的信息
         * logger.error("This is error message.");
         */
    }
}
