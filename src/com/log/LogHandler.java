package com.log;
import org.apache.log4j.Logger;
/**
 * 2016年3月7日
 * 
 * @author <a href = "wang.gaoliang@zte.com.cn">王高亮</a> 单例模式：构造函数私有化
 */
public class LogHandler {
    private static Logger logHandler;
    // 构造函数私有化
    private LogHandler() {
    }
    /**
     * 未做同步判断
     */
    public static Logger createUnSynInstance(Class clazz) {
        if (logHandler == null) {
            logHandler = Logger.getLogger(clazz);
        }
        return logHandler;
    }
    /**
     * 同步判断
     */
    public static Logger createSynchronizedInstance(Class clazz) {
        if (logHandler == null) {
            synchronized (LogHandler.class) {
                if (logHandler == null) {
                    logHandler = Logger.getLogger(clazz);
                }
            }
        }
        return logHandler;
    }
}
