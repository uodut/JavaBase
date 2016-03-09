package com.log;
import org.apache.log4j.Logger;
/**
 * 2016��3��7��
 * 
 * @author <a href = "wang.gaoliang@zte.com.cn">������</a> ����ģʽ�����캯��˽�л�
 */
public class LogHandler {
    private static Logger logHandler;
    // ���캯��˽�л�
    private LogHandler() {
    }
    /**
     * δ��ͬ���ж�
     */
    public static Logger createUnSynInstance(Class clazz) {
        if (logHandler == null) {
            logHandler = Logger.getLogger(clazz);
        }
        return logHandler;
    }
    /**
     * ͬ���ж�
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
