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
             * logger.info(e.getMessage()); // ��¼error�������Ϣ
             * logger.error(e.getMessage());
             */
            // e.printStackTrace();
        }
        /*
         * // ��¼debug�������Ϣ logger.debug("This is debug message."); //
         * ��¼info�������Ϣ logger.info("This is info message."); // ��¼error�������Ϣ
         * logger.error("This is error message.");
         */
    }
}
